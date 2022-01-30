package dataTypesAndVariables;

import java.util.Scanner;

public class Exercises {

    public static void main(String[] args) {
        //exercise1();
        //exercise2();
        exercise3();
    }

    public static void exercise1(){
        int a = 6;
        int b = 11;

        System.out.println(a + b);
    }

    public static void exercise2(){
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();

        System.out.printf("%.2f", input);
    }

    public static void exercise3(){
        int a = 192;
        int b = 168;
        int c = 1;
        int d = 10;

        System.out.printf("%H", a);
        System.out.print(":");
        System.out.printf("%H", b);
        System.out.print(":");
        System.out.printf("%H", c);
        System.out.print(":");
        System.out.printf("%H", d);
    }
}
