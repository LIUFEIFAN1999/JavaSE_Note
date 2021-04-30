package Note.Thread.CreateThread;

import static java.lang.Thread.sleep;

public class RunnableTread implements Runnable{
    private int ticket=100;
    @Override
    public void run() {
        while(true){
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "窗口卖出第" + (101 - ticket) + "张票");
                    ticket--;
                } else {
                    System.out.println("票已经卖完");
                    break;
                }
            try {
                sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        /**
         * 好处：
         * Runnable接口可以实现多个线程共享一个资源
         * 并且可以避免Java单继承的弊端
         * 线程与数据分离，解耦
         * 该程序仍存在缺点：
         * 当多个线程可以同时执行一个方法，从而造成重复卖票，没有做到同步
         */
        RunnableTread runnable = new RunnableTread();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
