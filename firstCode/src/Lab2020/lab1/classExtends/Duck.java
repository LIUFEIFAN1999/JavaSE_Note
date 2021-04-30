package Lab2020.lab1.classExtends;

public class Duck extends Animal {
    int size;
    public Duck( int newSize){
        size = newSize;
    }

    public Duck( String theName, int newSize){
        super(theName);
        size = newSize;
    }
}