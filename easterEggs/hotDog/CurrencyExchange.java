import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter USD: ");
        double usd = input.nextDouble();

        System.out.print("Enter exchange rate: ");
        double rate = input.nextDouble();

        double rmb = usd * rate;
        System.out.println("The money in RMB is " + rmb);
    }
}
