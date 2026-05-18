import java.util.Scanner;

public class SoftwareSales {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of packages: ");
        int quantity = input.nextInt();

        double pricePerPackage = 99;
        double discount = 0;

        if (quantity >= 100) {
            discount = 0.50;
        } else if (quantity >= 50) {
            discount = 0.40;
        } else if (quantity >= 20) {
            discount = 0.30;
        } else if (quantity >= 10) {
            discount = 0.20;
        }

        double total = quantity * pricePerPackage;
        double finalAmount = total - (total * discount);

        System.out.println("Total amount: $" + finalAmount);
    }
}
