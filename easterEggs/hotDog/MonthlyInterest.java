import java.util.Scanner;
class MonthlyInterest {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double balance = inputScanner.nextDouble();
        double rate = inputScanner.nextDouble();
        double interest = balance * (rate / 1200);
        System.out.println(interest);
    }
}