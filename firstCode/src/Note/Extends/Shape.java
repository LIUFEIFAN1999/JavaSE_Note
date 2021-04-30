package Note.Extends;

//向上转型
public class Shape {

    void draw() {
        System.out.println("shape draw");
    }
    void erase() {
        System.out.println("shape erase");
    }
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        s.erase();
    }

}

class Circle extends Shape{
    void draw() {
        System.out.println("circle draw");
    }
    void erase() {
        System.out.println("circle erase");
    }
}

class Square extends Shape{
    void draw() {
        System.out.println("square draw");
    }
    void erase() {
        System.out.println("square erase");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("triangle draw");
    }

    void erase() {
        System.out.println("triangle erase");
    }
}