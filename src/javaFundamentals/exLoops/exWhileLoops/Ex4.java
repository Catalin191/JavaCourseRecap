package javaFundamentals.exLoops.exWhileLoops;

//Within a loop read text from console and print it back (simple „echo”).

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int count = 0;
        while (count < 5){
            Scanner scan = new Scanner(System.in);
            String echo = scan.nextLine();
            System.out.println(echo);

            count++;
        }
    }
}
