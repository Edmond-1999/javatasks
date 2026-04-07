import java.util.Scanner;
class FractionCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int a = inputScanner.nextInt();
        int b = inputScanner.nextInt();
        int c = inputScanner.nextInt();
        int d = inputScanner.nextInt();
        if (b == 0 || d == 0) {
            System.out.println("Error");
        } else {
            int sumNumerator = a * d + c * b;
            int sumDenominator = b * d;
            double quotient = (double)a / b / ((double)c / d);
            System.out.println(sumNumerator + "/" + sumDenominator);
            System.out.println(quotient);
        }
    }
}