package Note.Super;

class Father{
    private String name;

    //构造器
    public Father(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fatherMethod(){
        System.out.println("我是你爸爸！");
    }
}

class Son extends Father{
    private String name;

    public Son(){
        super("Dad");
        this.name=super.getName()+"'Son";
    }

    public Son(String father, String son){
        super(father);
        this.name=father+"的"+son;
    }
    @Override
    public String getName() {
        return name;
    }

    public void sonMethod(){
        super.fatherMethod();
    }
}

public class FieldTest {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.getName());
    }
}
