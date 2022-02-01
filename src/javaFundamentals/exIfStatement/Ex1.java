package javaFundamentals.exIfStatement;

//Modify the sample application so that the retrieved number (age) comes
//from the console. Verify the application for each case (number smaller, equal to or
//greater than …).

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if (age < 18) {
            System.out.println("You are teenager!");
        } else if (age == 18){
            System.out.println("You are a young adult!");
        }
          else if (age > 100) {
            System.out.println("You are very old!");
        } else {
            System.out.println("You are adult!");
        }
    }
}
