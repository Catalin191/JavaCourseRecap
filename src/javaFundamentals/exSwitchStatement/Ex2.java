package javaFundamentals.exSwitchStatement;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a number from 0 to 5!");
        int num = scan.nextInt();

        switch (num){
            case 0:
                System.out.println('*');
                break;
            case 1:
                System.out.println('$');
                break;
            case 2:
                System.out.println('@');
                break;
            case 3:
                System.out.println('%');
                break;
            case 4:
                System.out.println('#');
                break;
            case 5:
                System.out.println('&');
                break;
            default:
                System.out.println("Not an option!");
        }
    }
}

