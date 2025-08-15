import java.util.Arrays;
import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("");
            System.out.print("Enter numbers: ");
            String input1 = sc.nextLine();
            

            if (input1.equalsIgnoreCase("Exit")) {
                System.out.println("Thankyou User!");
                break;
            }

            String[] input = input1.trim().split("\\s+");
            int[] arr = new int[input.length];

            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            System.out.print("{ ");


            for (int count = 0; count < arr.length; count++) {
                int minIndex = -1;
                int minValue = Integer.MAX_VALUE;

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] < minValue) {
                        minValue = arr[i];
                        minIndex = i;
                    }
                }
                arr[minIndex] = Integer.MAX_VALUE;
                System.out.print(minValue + ", ");

            }
            System.out.print("}");

        
            
        }
    }
}
