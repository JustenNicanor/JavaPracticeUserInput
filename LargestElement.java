import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LargestElement {

    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter numbers or enter 'Exit' to end: ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("EXIT")){
                System.out.println("Program Ended");
                break;

            }

            String[] parts = input.split(" ");
            int[] numbers = new int[parts.length]; 

            for (int i=0; i < parts.length; i++){
                numbers[i] = Integer.parseInt(parts[i]);
            }

            int max = numbers[0];

            for (int num : numbers){
                if (num > max){
                    max = num;
                }
            }

            System.out.println("Largest Element: " + max);


            Map<Integer, Integer> countMap = new HashMap<>();
            for (int num: numbers){
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }

            boolean foundRepeat = false;
            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()){
                if (entry.getValue() > 1) {
                    System.out.print("Repetitive no.: ");
                    System.out.println(entry.getKey() + " ");
                    foundRepeat = true;
                }
            }

            if (!foundRepeat) {
                System.out.print("Repetitive no.: ");
                System.out.println("None");
            }

           
            
            
        }


    }
    
}
