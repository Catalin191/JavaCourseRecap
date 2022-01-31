package javaFundamentals.exLoops;

import java.util.Scanner;

//The same as above, but if you’ll write „continue” – your application should go back to the
//beginning of your loop, without printing back your text.

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str =  scan.nextLine();
        String cont = scan.nextLine();

        while (!str.equals("quit")){
            if (cont.equals("continue")){
                System.out.println(str);
                str = scan.next();
            }else
                break;
        }
    }
}
