import java.util.Scanner;

public class Prb9_HitTheTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= 20 ; i++) {
            for (int j = 1; j <=20 ; j++) {
                if(target==i+j){
                    System.out.format("%s + %s = %s\n", i, j, target);
                }
            }

        }
        for (int i = 1; i <= 20 ; i++) {
            for (int j = 1; j <=20 ; j++) {
                if(target==i-j){
                    System.out.format("%s - %s = %s\n",i,j,target);
                }
            }

        }
    }
}
