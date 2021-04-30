package Note.Thread.Communication;

public class Consumer implements Runnable {
    private SynchronizedQueue queue;    //队列
    public Consumer(SynchronizedQueue queue) {
        this.queue=queue;
    }
    public void run() {
        while (true) {
            int size=queue.size();             //队列中的人数
            User user=queue.offer();           //入队
            System.out.println ("您前面有" + size + "人正在等待，您的编号为：" + user.getUserID());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}