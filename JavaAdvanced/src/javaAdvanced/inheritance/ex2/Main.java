package javaAdvanced.inheritance.ex2;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Cat("Lola", 5, "female", "prices", 3);
        Animal a2 = new Dog("Rex", 2, "male", "prince", 25);

        Animal[] zoo = {a1, a2};

        for (Animal a: zoo){
            System.out.println(a.yieldVoice());
        }
    }
}
