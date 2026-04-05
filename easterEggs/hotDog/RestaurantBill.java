import java.util.Scanner;

public class RestaurantBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter subtotal: ");
        double subtotal = input.nextDouble();
        System.out.print("Enter gratuity rate: ");
        double gratuityRate = input.nextDouble();
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;
        System.out.println(total);
    }
}