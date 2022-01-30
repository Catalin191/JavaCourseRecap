package javaFundamentals.exOperators;

//Write in a comment on each line what result you expect.
//Launch it and verify the results.
//int x = 4;
//System.out.println(x++);
//System.out.println(--x);
//System.out.println(x % 3);
//System.out.println(11 % 2);
//System.out.println(7 % x++);
//System.out.println(x == 4);
//System.out.println(x != 4);
//x = 10;
//int y = 5;
//System.out.println(x == 10 && y <= 5);
//System.out.println(x <= y && y > 5);
//System.out.println(„abc” instanceof String);

public class ex1 {
    public static void main(String[] args) {
        int x = 4;
        System.out.println(x++); //4
        System.out.println(--x); //3 //correct 4
        System.out.println(x % 3); // 0 // correct 1
        System.out.println(11 % 2); // 1
        System.out.println(7 % x++); // 1 // correct 3
        System.out.println(x == 4); // true // correct false
        System.out.println(x != 4); // true
        x = 10;
        int y = 5;
        System.out.println(x == 10 && y <= 5); //true
        System.out.println(x <= y && y > 5); //false
        System.out.println("abc" instanceof String); //true
    }
}
