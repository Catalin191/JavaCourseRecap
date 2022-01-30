package javaFundamentals.exStrings;

//Write in a comment on each line what result you expect.
//Launch it and verify the results.
//String a = "abc";
//String b = "abc";
//String c = new String("abc");
//System.out.println(a == b);
//System.out.println(a.equals(b));
//System.out.println(b == c);
//System.out.println(b.equals(c));

public class ex2 {
    public static void main(String[] args) {
            String a = "abc";
            String b = "abc";
            String c = new String("abc");
            System.out.println(a == b); //false //correct true
            System.out.println(a.equals(b)); //true
            System.out.println(b == c); //false
            System.out.println(b.equals(c)); //true

    }
}
