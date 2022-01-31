package javaFundamentals.exLoops.exDoWhileLoops;

//Within a loop read text from console and print it back (simple „echo”).

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int count = 0;

        do {
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            System.out.println(str);
            count++;
        } while (count < 1);
    }
}
