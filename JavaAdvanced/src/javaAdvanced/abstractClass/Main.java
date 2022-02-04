package javaAdvanced.abstractClass;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(2);
        Rectangle r1 = new Rectangle(4, 6);

        c1.getPerimeter();
        c1.getArea();

        r1.getPerimeter();
        r1.getArea();
    }
}
