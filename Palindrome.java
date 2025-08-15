import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Type 'Exit' to end");
            System.out.print("Enter a word: ");
            String input = scan.nextLine().toLowerCase();

            if (input.equalsIgnoreCase("Exit")){
                System.out.println("Thank you User!");
                break;
            }
            String reversed = "";

            for (int i = input.length() -1; i >= 0; i--){
                reversed += input.charAt(i);
            }

            if (input.equals(reversed)){
                System.out.println("True, it is a Palindrome!");
            } else {
                System.out.println("False, not a Palindrome");
            }

        }
        
    }
    
}
