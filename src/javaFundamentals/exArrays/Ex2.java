package javaFundamentals.exArrays;

//The same as above, but array size should come from user.

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array!");
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();

        int[] arr = new int[arraySize];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 5;
        arr[3] = 7;
        arr[4] = 10;

        for (int i: arr){
            System.out.println(i);
        }
    }
}
