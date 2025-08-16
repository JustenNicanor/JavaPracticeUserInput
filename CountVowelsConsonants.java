import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Type 'Exit' to end.");
            System.out.print("Enter a Word: ");
            String input = scan.nextLine().toLowerCase();

            if (input.equalsIgnoreCase("Exit")){
                System.out.println("Thankyou User!");
                break;
            }

            int vowels = 0, consonats = 0;

            for (char let : input.toCharArray()){
                if (Character.isLetter(let)) {
                    if ("aeiou".indexOf(let) != -1){
                        vowels++;
                    } else {
                        consonats++;
                    }

                }
            }

            System.out.println("Vowels: " + vowels);
            System.out.println("Cononants: " + consonats);


            
        }
    }
    
}
