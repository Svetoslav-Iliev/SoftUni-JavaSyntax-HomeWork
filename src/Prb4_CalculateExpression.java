import java.util.Scanner;

public class Prb4_CalculateExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double firstNum = Double.parseDouble(sc.nextLine());
        double secndNum = Double.parseDouble(sc.nextLine());
        double thirdNum = Double.parseDouble(sc.nextLine());

        double formulaOneSquare=Math.sqrt(thirdNum);
        double formulaOnePower=(firstNum+secndNum+thirdNum)/formulaOneSquare;
        double formulaOneResult = Math.pow((Math.pow(firstNum,2)+Math.pow(secndNum,2))/(Math.pow(firstNum,2)-Math.pow(secndNum,2)),formulaOnePower);

        double formulaTwoPower=firstNum-secndNum;

        double formulaTwoResult=Math.pow((Math.pow(firstNum,2)+Math.pow(secndNum,2)-Math.pow(thirdNum,3)), formulaTwoPower);

        double threeNumbersAverage=(firstNum+secndNum+thirdNum)/3;

        double formulaAverage=(formulaOneResult+formulaTwoResult)/2;

        double difference = Math.abs(formulaAverage-threeNumbersAverage);


        System.out.format("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", formulaOneResult, formulaTwoResult,difference);
    }
}
