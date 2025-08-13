public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8};
        int max = numbers[0];

        for (int num : numbers){
            if (num > max){
                max = num;
            }
        }

        System.out.println("Largest Element: " + max);


    }
    
}
