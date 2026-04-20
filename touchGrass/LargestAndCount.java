import java.util.Scanner;

public class LargestAndCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int count = 0;
        int number = 0;

        System.out.println("Enter numbers (0 to stop):");

        for (number = input.nextInt(); number != 0; number = input.nextInt()) {

            if (number > largest) {
                largest = number;
                count = 1;
            } else if (number == largest) {
                count = count + 1;
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Count: " + count);
    }
}
