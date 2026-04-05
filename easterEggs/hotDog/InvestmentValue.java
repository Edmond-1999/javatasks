import java.util.Scanner;

public class InvestmentValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter annual rate: ");
        double annualRate = input.nextDouble();
        System.out.print("Enter years: ");
        int years = input.nextInt();
        double monthlyRate = annualRate / 1200;
        int months = years * 12;
        double futureValue = amount * Math.pow(1 + monthlyRate, months);
        System.out.println(futureValue);
    }
}