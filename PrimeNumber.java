import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Type Exit to end.");
            System.out.print("Enter a number: ");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("EXIT")){
                System.out.println("Thankyou User!");
                break;
            }

            if (!input.matches("\\d+")) {
                System.out.println("Your input might have space or unnecessary characters (!@#$%^&*). Please try again.");
                continue;
            }

            
            int inputnum = Integer.parseInt(input);

            boolean isPrime = inputnum > 1;
            for (int i=2; i <= Math.sqrt(inputnum); i++){
                if (inputnum % i == 0){
                    isPrime = false;
                    break;
                }

            }

            System.out.println(inputnum + (isPrime? " is Prime number." : " is NOT  a Prime number"));


            
        }
    }
    
}
