package javaFundamentals.exObjectOrientedProgramming.ex2;

public class Room {

    private double width;
    private double length;
    private double height;

    public Room(double width, double length, double height){
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public void roomArea(){
        double area = width * length;
        System.out.println(area);
    }

    public void roomVolume(){
        double volume = width * length * height;
        System.out.println(volume);
    }
}
