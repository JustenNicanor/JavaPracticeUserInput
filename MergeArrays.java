import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class MergeArrays {

    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter your First Array or 'Exit' to end: ");
            Scanner sc = new Scanner(System.in);
            String input1 = sc.nextLine();


            if (input1.equalsIgnoreCase("Exit")){
                System.out.println("Thankyou User!");
                break;
            }

            System.out.print("Enter your Second Array or 'Exit' to end: ");
            String input2 = sc.nextLine();

            
            if (input2.equalsIgnoreCase("Exit")){
                System.out.println("Thankyou User!");
                break;
            }

            String[] parts1 = input1.trim().split("\\s+");
            String[] parts2 = input2.trim().split("\\s+");

            Integer[] input01 = new Integer[parts1.length];
            for (Integer i = 0; i < parts1.length; i++){
                input01[i] = Integer.parseInt(parts1[i]);
            }

            Integer[] input02 = new Integer[parts2.length];
            for (Integer i = 0; i < parts2.length; i++){
                input02[i] = Integer.parseInt(parts2[i]);
            }


            LinkedHashSet<Integer> set = new LinkedHashSet<>();
            set.addAll(Arrays.asList(input01));
            set.addAll(Arrays.asList(input02));

            System.out.println(set);


            


            
        }
    }
    
}
