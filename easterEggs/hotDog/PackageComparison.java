import java.util.Scanner;
class PackageComparison {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double weightOne = inputScanner.nextDouble();
        double priceOne = inputScanner.nextDouble();
        double weightTwo = inputScanner.nextDouble();
        double priceTwo = inputScanner.nextDouble();
        double unitOne = priceOne / weightOne;
        double unitTwo = priceTwo / weightTwo;
        if (unitOne < unitTwo) System.out.println("First");
        else System.out.println("Second");
    }
}