import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Type 'Exit' to end.");
            System.out.print("Type words: ");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("Exit")) {
                System.out.println("Thankyou User!");
                break;
            }

            String[] input1 = input.split(" ");
            StringBuilder result = new StringBuilder();

            for (String input01 : input1){
                result.append(new StringBuilder(input01).reverse()).append(" ");

            }

            System.out.println(result.toString().trim());

            
        }
    }
    
}
