package javaFundamentals.exArrays;

//Print sum of all the values from your array.

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array!");
        Scanner scan = new Scanner(System.in);
        int arraySize = scan.nextInt();
        int[] arr = new int[arraySize];

        System.out.println("Enter the values!");
        int values = scan.nextInt();

        for (int j = 0; j < arraySize; j++){
            arr[j] = values;
            if (j < arraySize-1){
                values = scan.nextInt();
            }
        }

        int total = 0;
        for (int i: arr){
            System.out.println(i);
            total +=i;
        }

        System.out.println("The sum of the values is: " + total);
    }
}
