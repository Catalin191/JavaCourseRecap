package javaAdvanced.abstractClass;

public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void getPerimeter() {
        int perimeter = 2 * length + 2 * width;
        System.out.println(perimeter);
    }

    @Override
    public void getArea() {
        int area = length * width;
        System.out.println(area);
    }
}
