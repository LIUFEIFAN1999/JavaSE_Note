package Note.Thread.Communication;

public class Producer implements Runnable {
    private SynchronizedQueue queue;    //队列
    public Producer(SynchronizedQueue queue) {this.queue=queue;}
    public void run() {
        while (true) {
            //获取当前运行线程
            Thread curThread=Thread.currentThread();
            //取出队列中的用户
            User user=queue.poll();
            if (user!=null) {
                System.out.println("请" + user.getUserID() + "号客户到" +
                        curThread.getName() + "办理业务！");
                System.out.println(curThread.getName() + "正在办理"+
                        user.getUserID() + "号客户业务.....");
            }
            try { Thread.sleep(2000); }
            catch (InterruptedException e) { e.printStackTrace();
            }
        }
    }
}