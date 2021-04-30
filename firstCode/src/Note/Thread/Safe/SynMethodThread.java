package Note.Thread.Safe;

import static java.lang.Thread.sleep;

public class SynMethodThread implements Runnable{
    private int ticket=100;
    @Override
    public void run() {
        while(true){
            synchronized (this) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "窗口卖出第" + (101 - ticket) + "张票");
                    ticket--;
                } else {
                    System.out.println("票已经卖完");
                    break;
                }
            }
            try {
                sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SynMethodThread runnable = new SynMethodThread();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
