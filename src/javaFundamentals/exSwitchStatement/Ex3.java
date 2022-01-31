package javaFundamentals.exSwitchStatement;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write the name of the symbol you want to print (star, dollar, at sing, percentage, number sign, ampersand)");
        String option = scan.nextLine().toLowerCase(Locale.ROOT);

        switch (option){
            case "star":
                System.out.println('*');
                break;
            case "dollar":
                System.out.println('$');
                break;
            case "at sing":
                System.out.println('@');
                break;
            case "percentage":
                System.out.println('%');
                break;
            case "number sign":
                System.out.println('#');
                break;
            case "ampersand":
                System.out.println('&');
                break;
            default:
                System.out.println("Not an option!");
        }
    }
}
