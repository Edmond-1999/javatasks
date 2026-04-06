import java.util.Scanner;

public class DoubleOperations {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double firstNumber = inputScanner.nextDouble();
        System.out.println("Enter the second number:");
        double secondNumber = inputScanner.nextDouble();

        double largerValue = Math.max(firstNumber, secondNumber);
        double smallerValue = Math.min(firstNumber, secondNumber);

        System.out.println("Larger number: " + largerValue);
        System.out.println("Smaller number: " + smallerValue);
        System.out.println("Sum: " + (firstNumber + secondNumber));
        System.out.println("Difference: " + (firstNumber - secondNumber));
        System.out.println("Product: " + (firstNumber * secondNumber));

        if (secondNumber != 0) {
            System.out.println("Quotient: " + (firstNumber / secondNumber));
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}
