import java.util.Scanner;

public class MonthlyInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter rate: ");
        double rate = input.nextDouble();
        double interest = amount * (rate / 1200);
        System.out.println(interest);
    }
}