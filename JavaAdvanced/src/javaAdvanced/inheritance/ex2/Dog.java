package javaAdvanced.inheritance.ex2;

public class Dog extends Animal{


    public Dog(String name, int age, String gender, String race, double weight) {
        super(name, age, gender, race, weight);
    }

    @Override
    public String yieldVoice(){
        return "Woof!!!";
    }
}
