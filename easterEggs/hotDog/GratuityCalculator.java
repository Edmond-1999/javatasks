import java.util.Scanner;
class GratuityCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double subtotal = inputScanner.nextDouble();
        double rate = inputScanner.nextDouble();
        double gratuity = subtotal * rate / 100;
        double total = subtotal + gratuity;
        System.out.println(gratuity);
        System.out.println(total);
    }
}