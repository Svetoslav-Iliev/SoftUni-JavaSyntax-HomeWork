import java.util.Scanner;

public class Prb5_DecimalToBase7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int n1 = Integer.parseInt(s1, 10);

        String s2 = Integer.toString(n1, 7);
        System.out.println(n1 + " is " + s2 + " in base-7");
    }
}
