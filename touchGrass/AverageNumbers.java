import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int sum = 0;
        int count = 0;

        System.out.print("Enter a number or a negative to break: ");
        number = input.nextInt();

        for (; number >= 0; ) {
            sum = sum + number;
            count = count + 1;

            System.out.print("Enter a number or a negative to break: ");
            number = input.nextInt();
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers entered.");
        }
    }
}
