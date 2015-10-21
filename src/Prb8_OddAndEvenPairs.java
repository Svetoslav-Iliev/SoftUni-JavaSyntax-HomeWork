import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prb8_OddAndEvenPairs {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            ArrayList<Integer> numbers = new ArrayList<>();
            inputReading(numbers, sc);
            checkForValidSize(numbers);
            checkPairs(numbers);

        }

    private static void checkPairs(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i+=2) {
            if (numbers.get(i)%2==0 && numbers.get(i+1)%2==0 ){
                System.out.format("%s, %s -> both are even", numbers.get(i), numbers.get(i+1));
                System.out.println();
            }
            else if(numbers.get(i)%2!=0 && numbers.get(i+1)%2!=0){
                System.out.format("%s, %s -> both are odd", numbers.get(i), numbers.get(i+1));
                System.out.println();

            }
            else if(numbers.get(i)%2==0 && numbers.get(i+1)%2!=0 ||numbers.get(i)%2!=0 && numbers.get(i+1)%2==0 ){
                System.out.format("%s, %s -> different", numbers.get(i), numbers.get(i+1));
                System.out.println();

            }
        }
    }

    private static void checkForValidSize(ArrayList<Integer> numbers) {
        if (numbers.size()%2!=0){
            System.out.println("Invalid lenght");
            System.exit(0);
        }
    }


    private static void inputReading(List<Integer> numbers, Scanner scanner) {
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }
    }
}
