import java.util.Scanner;
class DiscountCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double price = inputScanner.nextDouble();
        double discountPercentage = inputScanner.nextDouble();
        double discountAmount = price * discountPercentage / 100;
        double finalPrice = price - discountAmount;
        System.out.println(finalPrice);
    }
}