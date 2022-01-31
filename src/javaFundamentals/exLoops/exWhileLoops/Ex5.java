package javaFundamentals.exLoops.exWhileLoops;

//Within a loop read text from console and print it backwards.

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int count = 0;

        while (count < 1){
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            StringBuilder strBackwards = new StringBuilder(str);
            System.out.println(strBackwards.reverse());
        }
    }
}
