import java.util.Scanner;

public class Program
{
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int amount = scanner.nextInt();
//        //your code goes here

        int result = 0;
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                result += 10;
                System.out.println(result);
            } else {
                result += i;
                System.out.println(result);
            }
        }
        System.out.println(result);
    }
}
