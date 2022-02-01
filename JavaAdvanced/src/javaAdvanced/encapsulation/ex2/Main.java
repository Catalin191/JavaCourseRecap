package javaAdvanced.encapsulation.ex2;

public class Main {
    public static void main(String[] args) {
        Pocket p1 = new Pocket();

        p1.setMoney(200);
        System.out.println(p1.getMoney());

        p1.setMoney(-100);
        System.out.println(p1.getMoney());
    }
}
