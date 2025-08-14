import java.util.HashMap;
import java.util.Scanner;

public class FrequencyCharacters {

    public static void main(String[] args) {
        
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a word or '1' to stop: ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("1")) {
                System.out.println("Thankyou User!");
                break;
                
            }

            HashMap<Character, Integer> freq = new HashMap<>();
            for (char c : input.toCharArray()){
                freq.put(c, freq.getOrDefault(c, 0) + 1);

            }

            System.out.println("Frequencies: ");
            for (char c :   freq.keySet()){
                System.out.println(c + ": " + freq.get(c));
            }
        }
    }
}
