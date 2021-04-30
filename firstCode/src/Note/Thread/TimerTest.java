package Note.Thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

class MyTask1 extends TimerTask {
    public void run() {System.out.println("5秒之后运行的定时器"); }
}
class MyTask2 extends TimerTask {
    public void run() {System.out.println("每秒运行的定时器"); }
}
class MyTask3 extends TimerTask {
    public void run() {System.out.println(
            "从某日起每分钟运行的定时器!"); }
}


public class TimerTest {
    public static void main(String[] args) {
        Timer timer=new Timer(); //实例化定时器，如果在 Timer 的构造函数中输入 true ，则指定定时器采用守护线程的方式运行
        //设置 5s 后运行定时任务
        timer.schedule(new MyTask1(),5000);
        //设置 1s 后运行定时任务，之后每隔 1s 都再运行一次
        timer.schedule(new MyTask2(),1000,1000);
        //运行定时任务，之后每隔 1min 都再运行一次
        timer.schedule(new MyTask3(), new Date(),1000*60);
    }
}
