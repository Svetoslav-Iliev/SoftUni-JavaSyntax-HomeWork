import java.util.Scanner;

public class Prb12_CharecterMultiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inputStrings = sc.nextLine().split(" ");
        String stringOne = inputStrings[0];
        String stringTwo = inputStrings[1];

        if(stringOne.length()==stringTwo.length()){
            calculatingStrings(stringOne, stringTwo);
        } else{
            calculateStringWithDifferentLenght(stringOne, stringTwo);
        }


    }

    private static void calculateStringWithDifferentLenght(String stringOne, String stringTwo) {
        int resultToAdd=0;
        int resultToMultiply=1;

        if(stringOne.length()>stringTwo.length()){
            for (int i = 0; i < stringTwo.length(); i++) {
                resultToMultiply+=stringOne.charAt(i)*stringTwo.charAt(i);
            }
           String subStr=new String(stringOne.substring(stringTwo.length()));
           for (int i = 0; i <subStr.length() ; i++) {
               resultToAdd+=subStr.charAt(i);
           }
        } else if(stringOne.length()<stringTwo.length()){
            for (int i = 0; i < stringOne.length(); i++) {
                resultToMultiply+=stringOne.charAt(i)*stringTwo.charAt(i);
            }
           String subStr=new String(stringTwo.substring(stringOne.length()));
           for (int i = 0; i <subStr.length() ; i++) {
               resultToAdd+=subStr.charAt(i);
           }

        }

        System.out.println(resultToMultiply+resultToAdd);

    }

    private static void calculatingStrings(String stringOne, String stringTwo) {


        int result =0;
        for (int i = 0; i < stringTwo.length(); i++) {
            result+=stringOne.charAt(i)*stringTwo.charAt(i);
        }

        System.out.println(result);
    }
}
