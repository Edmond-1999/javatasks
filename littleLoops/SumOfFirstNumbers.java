import java.util.Scanner;

public class SumOfFirstNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        int sum = 0;

        for (int number = 1; number <= userInput; number++) {
            sum += number;
        }

        System.out.println("Sum = " + sum);
    }
}
