package javaFundamentals.exLoops;

//*Draw rectangle from stars
//Use nested for loops – parent loops iterator should be called „row”, child one – „column”.
//Output:
//****
//****
//****

public class Ex3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
