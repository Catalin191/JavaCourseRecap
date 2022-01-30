package javaFundamentals.exStrings;

// Create variable of type String. Initialize it with value „Lorem ipsum dolor sit amet, consectetur adipiscing
//elit”.
//a) Convert it to lower case.
//b) Convert it to upper case.
//c) Replace „o” with „z”.
//d) Check if your variable ends with „elit”.

import java.util.Locale;

public class ex1 {
    public static void main(String[] args) {
        String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";

        System.out.println(lorem.toLowerCase(Locale.ROOT));
        System.out.println(lorem.toUpperCase(Locale.ROOT));
        System.out.println(lorem.replace('o', 'z'));
        System.out.println(lorem.endsWith("elit"));
    }
}
