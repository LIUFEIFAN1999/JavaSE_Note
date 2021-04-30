package Note.Thread.Safe;

import Note.Thread.CreateThread.RunnableTread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

public class LockTest implements Runnable{
    private Lock lock = new ReentrantLock();
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "窗口卖出第" + (101 - ticket) + "张票");
                ticket--;
            }
            else {
                System.out.println("票已经卖完");
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        Runnable runnable = new LockTest();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
