package javaAdvanced.encapsulation.ex2;

/*Create class Pocket.
        a) Add field „money”, create constructor, getter and setter.
        b) Add verification for both getter and setter. Getter should result in returning as much
        money, as the user asked for. It should return 0 if money <= 10.
        c) Setter should not accept values below 0 and greater than 3000. It may print a message
       like „I don’t have enough space in my pocket for as much money!” */

public class Pocket {
    private int money;

    public int getMoney() {
        if (money <= 10){
            return 0;
        }else {
            return money;
        }
    }

    public void setMoney(int money) {
        if (money < 0){
            System.out.println("Please add money!");
        } else if (money > 3000){
            System.out.println("Pocket to small for so much money!");
        }else {
            this.money = money;
        }
    }
}
