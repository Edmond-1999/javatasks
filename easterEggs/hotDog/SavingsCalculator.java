import java.util.Scanner;
class SavingsCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double monthly = inputScanner.nextDouble();
        double rate = 0.0375 / 12;
        double first = monthly * (1 + rate);
        double second = (first + monthly) * (1 + rate);
        double third = (second + monthly) * (1 + rate);
        double fourth = (third + monthly) * (1 + rate);
        double fifth = (fourth + monthly) * (1 + rate);
        double sixth = (fifth + monthly) * (1 + rate);
        System.out.println(sixth);
    }
}