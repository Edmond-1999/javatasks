import java.util.Scanner;

public class WageCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter hourly wage:");
        double hourlyRate = inputScanner.nextDouble();
        System.out.println("Enter hours worked:");
        double hoursWorked = inputScanner.nextDouble();

        if (hoursWorked <= 40) {
            System.out.println("Total pay: " + (hoursWorked * hourlyRate));
        } else {
            double overtimeHours = hoursWorked - 40;
            double totalPay = (40 * hourlyRate) + (overtimeHours * hourlyRate * 1.5);
            System.out.println("Total pay (including overtime): " + totalPay);
        }
    }
}
