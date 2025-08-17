import java.util.Scanner;

public class FactorialRecursion {

    public static int factorial(int n){
        if (n==0 || n==1) return 1;
        return n * factorial(n-1);
                
    }
    
    public static void main(String[] args) {

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Type 'Exit' to end.");
            System.out.print("Enter a number: ");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("Exit")) {
                System.out.println("Thankyou User!");
                break;
                
            }

            int num = Integer.parseInt(input);

            System.out.println(num+": "+ factorial(num));
            
        }
    }
    
    
}
