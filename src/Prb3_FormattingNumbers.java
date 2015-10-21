import java.util.Scanner;

public class Prb3_FormattingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNum = Integer.parseInt(sc.nextLine());;
        double secondNum = Double.parseDouble(sc.nextLine());
        double thirdNum = Double.parseDouble(sc.nextLine());

        String intAsHex = Integer.toHexString(firstNum).toUpperCase();
        String intAsBinary = String.format("%10s", Integer.toBinaryString(firstNum)).replace(' ', '0');

        System.out.format("|%-10s|%10s|%10.2f|%-10.3f|", intAsHex, intAsBinary, secondNum, thirdNum);
    }

}
