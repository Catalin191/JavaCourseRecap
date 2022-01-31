package javaFundamentals.exArrays;

//Create a multiplication table. Your application should write all values to the
//multidimensional array at first and then print its values.

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println("Multiplication table");
        System.out.println("Enter the number you want to multiply");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] arr = new int[11];

        for (int i = 0; i < 11; i++){
            arr[i] = i * num;
        }

        for (int i: arr){
            System.out.println(i);
        }
    }
}
