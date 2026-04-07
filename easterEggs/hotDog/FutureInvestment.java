import java.util.Scanner;
class FutureInvestment {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double amount = inputScanner.nextDouble();
        double rate = inputScanner.nextDouble();
        int years = inputScanner.nextInt();
        double future = amount * Math.pow(1 + rate / 1200, years * 12);
        System.out.println(future);
    }
}