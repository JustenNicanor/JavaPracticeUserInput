import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FindSecondLargestArray {

    public static void main(String[] args) {

        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an Array or Exit to end: ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("EXIT")) {
                System.out.println("Program Ended");
                break;
                
            }

           

            if (!input.matches("[0-9 ]+")){
                System.out.println("Again");
                continue;
            }

            String[] parts = input.trim().split("\\s+");
            if (parts.length < 2){
                System.out.println("Enter atleast 2 numbers please. ");
                continue;
                

            
            }

            String[] input1 = input.trim().split("\\s+");
            int[] parts1 = new int[input1.length];

            for (int i = 0; i < input1.length; i++){
                parts1[i] = Integer.parseInt(input1[i]);

            }

            Arrays.sort(parts1);
            System.out.println("Answer: " + parts1[parts1.length - 2]);
        
                
          

            

            
            
        }
      


    }
    
}
