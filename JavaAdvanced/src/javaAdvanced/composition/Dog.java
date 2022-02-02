package javaAdvanced.composition;

public class Dog {
    private String name;
    private int age;
    private String gender;
    private String race;
    private double weight;
    private Muzzle muzzle;

    public Dog(String name, int age, String gender, String race, double weight, Muzzle muzzle) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
        this.muzzle = muzzle;
    }

    public Dog(String gender, String race){
        this.gender = gender;
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0){
            System.out.println("Age must be > 0!");
        }else {
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0){
            System.out.println("You can't have 0 or negative weight!");
        } else {
            this.weight = weight;
        }
    }

    public Muzzle getMuzzle() {
        return muzzle;
    }

    public void setMuzzle(Muzzle muzzle) {
        this.muzzle = muzzle;
    }
}
