package Note.Thread.Communication;

public class Test {
    public static void main(String[] args) {
        SynchronizedQueue queue=new SynchronizedQueue();
        new Thread(new Consumer(queue),"消费者1").start();
        new Thread(new Consumer(queue),"消费者2").start();
        Producer tw=new Producer(queue);
        new Thread(tw,"一号窗口").start();
        new Thread(tw,"二号窗口").start();
        new Thread(tw,"三号窗口").start();
    }
}
