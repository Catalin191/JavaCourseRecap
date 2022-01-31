package javaFundamentals.exObjectOrientedProgramming.ex1;

public class Dog {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void bark(){
        if (age < 10) {
            System.out.println("WOOF!!! WOOF!!! WOOF!!!");
        }else {
            System.out.println("woof!");
        }
    }
}
