import java.util.Scanner;

public class FareCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in miles: ");
        double distance = input.nextDouble();

        double fare;

        if (distance <= 5) {
            fare = 2.00;
        } else {
            double extraDistance = distance - 5;
            fare = 2.00 + (extraDistance * 0.50);
        }

        System.out.println("Total fare: $" + fare);
    }
}
