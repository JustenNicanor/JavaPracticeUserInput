import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Type 'Exit' to end");
            System.out.print("Input your name or 'EXIT' to end: ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("EXIT")){
                System.out.println("Thankyou User!");
                break;
            }
            String reversed = "";
            String firstWord = input.split(" ")[0];

            for (int i = firstWord.length() - 1; i >= 0; i-- ){

                reversed += firstWord.charAt(i);

            }

            System.out.println(reversed);
            
        }

    }

}