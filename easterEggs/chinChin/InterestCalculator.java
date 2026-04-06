import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter principal amount:");
        double principalAmount = inputScanner.nextDouble();
        System.out.println("Enter rate (%):");
        double rateValue = inputScanner.nextDouble();
        System.out.println("Enter time (years):");
        double timeValue = inputScanner.nextDouble();

        double simpleInterest = (principalAmount * rateValue * timeValue) / 100;
        double compoundInterest = principalAmount * Math.pow((1 + rateValue / 100), timeValue) - principalAmount;

        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Compound Interest: " + compoundInterest);
    }
}
