import java.util.Arrays;
import java.util.Scanner;

public class SortLetters {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Type Exit to end.");
            System.out.print("Enter a Sentence: ");
            String input = scan.nextLine();
            String[] input1 = input.trim().split("");



            if (input.equalsIgnoreCase("Exit")) {
                System.out.println("Thankyou User!");
                break;
            }
            

            Arrays.sort(input1, String.CASE_INSENSITIVE_ORDER);
            System.out.println(String.join(" ", input1));
        }
    }
    
}
