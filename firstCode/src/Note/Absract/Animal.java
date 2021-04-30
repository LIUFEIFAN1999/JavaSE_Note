package Note.Absract;

/*
 *抽象方法：前面加上abstract，去掉大括号
 * 抽象类：前面加上abstract,0-n个抽象方法
 */
public abstract class Animal {
    public abstract void eat();
    public abstract void sleep();
    public abstract void speak();
    public boolean isAnimal(){
        return true;
    }
}

