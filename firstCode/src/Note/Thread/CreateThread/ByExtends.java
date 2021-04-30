package Note.Thread.CreateThread;

public class ByExtends extends Thread{
    private int ticket = 100;
    public void run(){
        while(true){
            if(ticket>0){
                System.out.println(Thread.currentThread().getName()+"窗口卖出第"+(101-ticket)+"张票");
                ticket--;
            }
            else{
                System.out.println("票已经卖完");
                break;
            }
        }
    }

    public static void main(String[] args) {
        /**
         * 每一个线程都是独立的，并没有共享100张票
         */
        new ByExtends().start();
        new ByExtends().start();
        new ByExtends().start();
        new ByExtends().start();
    }
}
