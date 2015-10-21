import java.util.Scanner;

public class Prb14_MagicWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        System.out.println(areExchangeable(input[0], input[1]));
    }

    private static boolean areExchangeable(String str1, String str2) {
        if (getSignature(str1).equals(getSignature(str2))) {
            return true;
        }
        return false;
    }
    private static String getSignature(String str) {
        String signature = "";
        for (int i = 0; i < str.length(); i++) {
            signature += str.indexOf(str.charAt(i));
        }
        return signature;
    }
}

