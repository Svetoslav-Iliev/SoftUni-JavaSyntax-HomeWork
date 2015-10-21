import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prb10_ExtractWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        Pattern regex = Pattern.compile("[A-Za-z]{2,}");
        Matcher match = regex.matcher(line);

        while (match.find()){
            System.out.print(match.group(0) + " ");
        }
    }
}
