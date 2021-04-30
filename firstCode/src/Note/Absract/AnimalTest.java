package Note.Absract;

public class AnimalTest {
    public static void main(String[] args) {
        //!Animal animal = new Animal();
        //用抽象类接收Cat对象，向上转型
        Animal animal = new Cat();
        animal.eat();
    }
}
