package Note.Exception.Finally;

public class finallyOrderTest {
    public static void main(String[] args) {
        try{
            System.out.println("try块执行");
            throw new RuntimeException();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("catch块执行");
        }finally{
            System.out.println("finally块执行");
        }
    }
}
