package javaFundamentals.exIfStatement;

//* As above, but instead of values, operate on strings.
//E.g. for the word "star", display "*".

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write the name of the symbol you want to print (star, dollar, percentage, and, plus)");
        String string = scan.nextLine();

        if (string.toLowerCase(Locale.ROOT).equals("star")){
            System.out.println('*');
        } else if (string.toLowerCase(Locale.ROOT).equals("dollar")){
            System.out.println('$');
        } else if (string.toLowerCase(Locale.ROOT).equals("percentage")){
            System.out.println('%');
        } else if (string.toLowerCase(Locale.ROOT).equals("and")){
            System.out.println('&');
        } else if (string.toLowerCase(Locale.ROOT).equals("plus")){
            System.out.println('+');
        }
    }
}
