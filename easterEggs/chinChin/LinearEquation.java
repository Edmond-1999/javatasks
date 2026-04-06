import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Solve equation: ax + b = c");

        System.out.println("Enter value for a:");
        double coefficientA = inputScanner.nextDouble();
        System.out.println("Enter value for b:");
        double coefficientB = inputScanner.nextDouble();
        System.out.println("Enter value for c:");
        double coefficientC = inputScanner.nextDouble();

        if (coefficientA == 0) {
            System.out.println("There is no unique solution.");
        } else {
            double solutionValue = (coefficientC - coefficientB) / coefficientA;
            System.out.println("The value of x is: " + solutionValue);
        }
    }
}
