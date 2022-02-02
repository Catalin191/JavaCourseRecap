package javaAdvanced.inheritance.ex1;

// Create a Shape class.
//a) Add fields, create constructor, getters and setters.
//b) Create classes Rectangle and Circle. Both of them should inherit class Shape.
//Which fields and methods are common?

public class Shape {
    private int length;
    private int width;
    private int radius;

    public Shape(int length, int width){
        this.length = length;
        this.width = width;
    }

    public Shape(int radius){
        this.radius = radius;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
