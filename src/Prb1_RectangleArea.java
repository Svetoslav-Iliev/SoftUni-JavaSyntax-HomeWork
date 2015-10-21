import java.util.Scanner;

public class Prb1_RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sideA=sc.nextInt();
        int sideB=sc.nextInt();

        System.out.println(calcRectangleArea(sideA,sideB));
    }

    private static int calcRectangleArea(int a, int b){

        return a*b;
    }
}
