package javaAdvanced.composition;

public class Main {
    public static void main(String[] args) {
        Muzzle muzzle = new Muzzle(true, "red");
        Dog dog = new Dog("Rex", 2, "male", "dog", 12, muzzle);

        System.out.println(dog.getMuzzle().getColor());
        System.out.println(dog.getMuzzle().isHasSpikes());

    }
}
