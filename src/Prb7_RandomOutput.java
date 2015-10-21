import java.util.*;

public class Prb7_RandomOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbersArray=new ArrayList<>();

        int firstNumber=sc.nextInt();
        int secondNumber=sc.nextInt();
        Random rnd = new Random();
        int startArrayNumber=0;
        int arrayListLenght=1;

        if (firstNumber>secondNumber){
            startArrayNumber=secondNumber;
            arrayListLenght=firstNumber-secondNumber;
        }else  {
            startArrayNumber=firstNumber;
            arrayListLenght=secondNumber-firstNumber;
        }

        fillListWithNumbers(numbersArray, startArrayNumber, arrayListLenght);

        long seed = System.nanoTime();
        Collections.shuffle(numbersArray, new Random(seed));

        printListInRandomOrder(numbersArray);
    }

    private static void printListInRandomOrder(ArrayList<Integer> numbersArray) {
        for (Integer integer : numbersArray) {
            System.out.println(integer);
        }
    }

    private static void fillListWithNumbers(ArrayList<Integer> numbersArray, int startArrayNumber, int arrayListLenght) {
        for (int i = 0; i <= arrayListLenght; i++) {
        numbersArray.add(startArrayNumber+i);
        }
    }

}
