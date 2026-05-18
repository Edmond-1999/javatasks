import java.util.Scanner;

public class BankCharges {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter beginning balance: ");
        double balance = input.nextDouble();

        System.out.print("Enter number of checks: ");
        int numberOfChecks = input.nextInt();

        double serviceFee = 10;

        if (balance < 400) {
            serviceFee = serviceFee + 15;
        }

        if (numberOfChecks < 20) {
            serviceFee = serviceFee + (numberOfChecks * 0.10);
        } else if (numberOfChecks <= 39) {
            serviceFee = serviceFee + (numberOfChecks * 0.08);
        } else if (numberOfChecks <= 59) {
            serviceFee = serviceFee + (numberOfChecks * 0.06);
        } else {
            serviceFee = serviceFee + (numberOfChecks * 0.04);
        }

        System.out.println("Total bank charges: $" + serviceFee);
    }
}
