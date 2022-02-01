package javaFundamentals.exDataTypesAndVariables;

// *Print values: 192, 168, 1, 10 in HEX format XX:XX:XX:XX.
//Use System.out.printf() method.
//Input: 192, 168, 1, 10
//Output: „C0:A8:01:0A”

public class Ex7 {
    public static void main(String[] args) {
        System.out.printf("%02X ", 192, 168, 1, 10);
        System.out.printf("%02X ", 168, 1, 10);
        System.out.printf("%02X ", 1, 10);
        System.out.printf("%02X", 10);
    }
}
