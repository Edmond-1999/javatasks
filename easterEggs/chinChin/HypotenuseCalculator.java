import java.util.Scanner;

public class HypotenuseCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter the length of the first leg:");
        double firstLeg = inputScanner.nextDouble();

        System.out.println("Enter the length of the second leg:");
        double secondLeg = inputScanner.nextDouble();

        double hypotenuseValue = Math.sqrt((firstLeg * firstLeg) + (secondLeg * secondLeg));
        System.out.println("The hypotenuse is: " + hypotenuseValue);
    }
}
