package javaAdvanced.encapsulation.ex1;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Mark", 4, "male", "Shi-tzu", 7.5);

        System.out.println(dog1.getAge());
        System.out.println(dog1.getWeight());

        dog1.setAge(6);
        dog1.setWeight(5.5);

        System.out.println(dog1.getAge());
        System.out.println(dog1.getWeight());
    }
}
