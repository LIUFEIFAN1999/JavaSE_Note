package Note.Thread.Safe;

import static java.lang.Thread.sleep;

public class WatchingTest {
    public static void main(String[] args) {
        Thread myThread = new WatchingThread();
        myThread.setDaemon(true);//设置为守护线程，否则程序一直不会停止
        myThread.start();
        for(int i=0; i<10; i++){
            System.out.println("*");
            try {
                sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
