package Note.Thread.CreateThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class NewThread {
    private static void doSomething() {
        System.out.println("主线程方法");
    }

    /**
     * 实现Callable接口，并且利用FutureTask获取线程方法的返回值
     *
     */
    public static void main(String[] args) {
        Callable<String> callable = new CallableThread();
        FutureTask<String> futureTask = new FutureTask<String>(callable);
        Thread thread = new Thread(futureTask);
        thread.start();//开启一个线程方法
        //以下的方法可与上边的线程并发执行
        doSomething();
        try {
            System.out.println(futureTask.get());//获取线程返回值
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}


