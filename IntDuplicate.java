import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

public class IntDuplicate {

    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Type Exit to end.");
            System.out.println("Enter a numbers: ");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("Exit")) {
                System.out.println("Thankyou user!");
                break;
            }

            String[] input1 = input.split(" ");
            Integer[] inputnum = new Integer[input1.length];

            for (int i= 0; i<input1.length; i++){
                inputnum[i] = Integer.parseInt(input1[i]);
            }
            Arrays.sort(inputnum);

            LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(inputnum));
            System.out.println(set);
            
        }
    }
    
}
