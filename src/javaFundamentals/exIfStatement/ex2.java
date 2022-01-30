package javaFundamentals.exIfStatement;

//Pick from the console a value from 0 to 5. On the basis of the obtained value, display
//any sign. For example, for number 0, display "*", for 1 display "$" (or any other).

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a number from 0 to 5!");
        int num = scan.nextInt();

        if (num == 0){
            System.out.println('*');
        } else if (num == 1){
            System.out.println('$');
        } else if (num == 2){
            System.out.println('@');
        } else if (num == 3){
            System.out.println('%');
        } else if (num == 4){
            System.out.println('#');
        } else if (num == 5){
            System.out.println('&');
        }
    }
}
