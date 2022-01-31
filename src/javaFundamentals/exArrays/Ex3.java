package javaFundamentals.exArrays;
import java.util.Scanner;

//The same as above, but values should also come from user

public class Ex3 {
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

        for (int i: arr){
            System.out.println(i);
        }
    }
}
