import java.util.Scanner;

public class Prb6_Base7ToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int n1 = Integer.parseInt(s1, 7);
        String s2 = Integer.toString(n1, 10);
        System.out.println(s1 + " is " + s2 + " in decimal");
    }
}
