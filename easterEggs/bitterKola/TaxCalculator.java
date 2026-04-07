import java.util.Scanner;
class TaxCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double salary = inputScanner.nextDouble();
        double tax;
        if (salary <= 300000) {
            tax = 0;
        } else if (salary <= 600000) {
            tax = (salary - 300000) * 0.15;
        } else {
            tax = (300000 * 0.15) + (salary - 600000) * 0.25;
        }
        System.out.println(tax);
    }
}