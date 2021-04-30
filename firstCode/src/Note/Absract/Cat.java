package Note.Absract;

//非抽象子类必须实现所有抽象方法
public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("晚上睡");
    }

    @Override
    public void speak() {
        System.out.println("喵喵喵~");
    }
}
