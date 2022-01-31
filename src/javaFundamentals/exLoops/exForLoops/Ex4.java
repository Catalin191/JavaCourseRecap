package javaFundamentals.exLoops.exForLoops;

//Calculate sum of index value from 10 to 30, using for loop.

public class Ex4 {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 10; i <= 30; i++){
            num += i;
        }
        System.out.println(num);
    }
}
