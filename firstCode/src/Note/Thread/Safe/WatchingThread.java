package Note.Thread.Safe;

import java.io.File;

public class WatchingThread extends Thread{
    private File file = new File("C:");

    @Override
    public void run() {
        while(true){
            long free = file.getFreeSpace();
            System.out.println("C盘剩余空间="+free/1024/1024/1024+"G");
            if(free<1024*1024*1024)
                System.out.println("C盘剩余空间不足1G");
            try{
                sleep(5000);
            }catch (InterruptedException e){
                System.out.println("睡眠被中断");
            }
        }
    }
}
