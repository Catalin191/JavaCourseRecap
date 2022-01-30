package operatores;

public class Exercises {

    public static void main(String[] args) {
        exercise1();
    }

    public static void exercise1(){
        int x = 4;
        System.out.println(x++); //6 // here x is 4; first it prints the x and then it increments bay 1
        System.out.println(--x); //2 // here x is 5; first subtract 1 and then print the result
        System.out.println(x % 3); //1 // here x is 4; the answer is the rest of the division
        System.out.println(11 % 2); //1 // the answer is the rest of the division
        System.out.println(7 % x++); //3 // the answer is the rest of the division; then increments x by 1
        System.out.println(x == 4); //true // here x is 5; the correct answer is false
        System.out.println(x != 4); //false // here x is 5; the correct answer is true
        x = 10; // the value of x changes to 10
        int y = 5;
        System.out.println(x == 10 && y <=5); //true
        System.out.println(x <= y && y > 5); //false
        System.out.println("abc" instanceof String); //abc // correct answer is true; "abc" is a string
    }
}
