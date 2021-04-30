package Note.Thread.Communication;

import java.util.LinkedList;

public class SynchronizedQueue {
    private LinkedList<User> data=new LinkedList<>();
    private final int SIZE=5;
    private int userNumber=0;
    //入队返回入队的用户对象
    public synchronized User offer() {
        //如果队列已经满了，让生产者线程等待
        if(data.size()>=SIZE) {
            try {
                System.out.println("队列满，"+Thread.currentThread().
                        getName()+"等待!");
                wait();
            } catch (InterruptedException e) { e.printStackTrace(); }
        }
        userNumber++;
        User user=new User(userNumber);         //产生用户
        data.offer(user);                                       //加入集合尾部
        System.out.println(Thread.currentThread().getName()
                +"产生数据!");
        if(data.size()>=0) { notify(); }
        return user;
    }
    //出队返回出队的用户对象
    public synchronized User poll() {
        //如果队列已经满了，则让消费者线程等待
        if(data.isEmpty()) {
            try {
                System.out.println("队列空，"+Thread.currentThread().
                        getName()+"等待!");
                wait();
            } catch (InterruptedException e) { e.printStackTrace(); }
        }
        User user=data.poll();
        System.out.println(Thread.currentThread().getName()
                +"取出数据!");
        if(data.isEmpty()) { notify(); }
        return user;
    }
    //查看队列长度
    public int size() {
        return data.size();
    }
}