import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = input.nextInt();

        double bill;

        if (units <= 100) {
            bill = units * 1.5;
        } else if (units <= 200) {
            bill = (100 * 1.5) + (units - 100) * 2.0;
        } else {
            bill = (100 * 1.5) + (100 * 2.0) + (units - 200) * 3.0;
        }

        System.out.println("Electricity bill: $" + bill);
    }
}
