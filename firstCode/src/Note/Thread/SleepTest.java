package Note.Thread;

public class SleepTest {
    public static void main(String[] args) {
        for(int i =0; i<10; i++){
            System.out.println("*");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("休眠被打断");
            }
        }
    }
}
