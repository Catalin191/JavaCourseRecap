package javaAdvanced.inheritance.ex2;

public class Cat extends Animal{

    public Cat(String name, int age, String gender, String race, double weight) {
        super(name, age, gender, race, weight);
    }

    @Override
    public String yieldVoice(){
        return "Miau!!!";
    }
}
