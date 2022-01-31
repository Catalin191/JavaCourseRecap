package javaFundamentals.exArrays;

//Create int array with the specified size. Fill it with different values. Print all values to the
//console using enhanced for loop.

public class Ex1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
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
