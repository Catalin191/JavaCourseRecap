package javaFundamentals.exSwitchStatement;

//Modify the sample application so that the retrieved direction comes
//from the console. Verify the application for each case (‚e’, ‚w’…).

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        System.out.println("Choose the direction you want to go! (n, s, e, w)");
        Scanner scan = new Scanner(System.in);
        String direction = scan.nextLine();

        switch (direction) {
            case "n":
                System.out.println("You are going North!");
                break;
            case "s":
                System.out.println("You are going South!");
                break;
            case "e":
                System.out.println("You are going East!");
                break;
            case "w":
                System.out.println("You are going West!");
                break;
            default:
                System.out.println("Bad direction!");
        }
    }
}
