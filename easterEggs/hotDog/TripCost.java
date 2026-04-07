import java.util.Scanner;
class TripCost {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double distance = inputScanner.nextDouble();
        double efficiency = inputScanner.nextDouble();
        double price = inputScanner.nextDouble();
        double cost = distance / efficiency * price;
        System.out.println(cost);
    }
}