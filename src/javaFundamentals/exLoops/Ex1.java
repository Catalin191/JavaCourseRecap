package javaFundamentals.exLoops;

//Do simple „echo” application. Your application should work as long, as you won’t write „quit”

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str =  scan.nextLine();

        while (!str.equals("quit")){
            System.out.println(str);
            str = scan.next();
        }
    }
}
