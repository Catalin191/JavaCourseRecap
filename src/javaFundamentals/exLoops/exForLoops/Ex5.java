package javaFundamentals.exLoops.exForLoops;

//*Create nested for loop. Print actual values of the iterators.
//E.g.:
//i=5 : j=0
//i=5 : j=1
//i=5 : j=2

public class Ex5 {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--){
           for (int j = 0; j < 5; j++){
               System.out.println("i = " + i + " : " + "j = " + j);
           }
        }
    }
}
