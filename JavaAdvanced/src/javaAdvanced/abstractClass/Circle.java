package javaAdvanced.abstractClass;


public class Circle extends Shape {

    private int radius;
    private final double PI = Math.PI;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void getPerimeter() {
        int perimeter = (int) (2 * PI * radius);
        System.out.println(perimeter);
    }

    @Override
    public void getArea() {
        int area = (int)(PI * Math.sqrt(radius));
        System.out.println(area);
    }
}
