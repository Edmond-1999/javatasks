import java.util.Scanner;
class CurrencyConverter {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int choice = inputScanner.nextInt();
        double amount = inputScanner.nextDouble();
        if (choice == 0) System.out.println(amount * 6.8);
        else if (choice == 1) System.out.println(amount / 6.8);
        else System.out.println("Error");
    }
}