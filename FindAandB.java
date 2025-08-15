import java.util.Scanner;

public class FindAandB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter i: ");
        int i = sc.nextInt();
        System.out.print("Enter j: ");
        int j = sc.nextInt();

        boolean found = false;

        for (int a = 1; a < n; a++) {  
            int remaining = n - a * j;
            if (remaining > 0 && remaining % i == 0) { 
                int b = remaining / i;
                if (b > 0) {
                    System.out.println("b = " + b + ", a = " + a);
                    found = true;
                    break; 
                }
            }
        }

        if (!found) {
            System.out.println("No solution");
        }
    }
}

    

