import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        while (true) {
            System.out.print("Input your name or 'EXIT' to end: ");
            Scanner sc = new Scanner(System.in);
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