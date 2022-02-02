package javaAdvanced.inheritance.ex2;

/*Create classes Dog and Cat.
        a) Move common methods and fields to the class Animal.
        b) Create method „yieldVoice”.
        c) Create simple array of type Animal, that will contain one object of type Dog and
        one object of type Cat.
        d) Using for-each loop show which animal gives what kind of voice. How to print a
        name of an object? */

public class Animal {
    private String name;
    private int age;
    private String gender;
    private String race;
    private double weight;

    public Animal(String name, int age, String gender, String race, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }

    public String yieldVoice(){
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
