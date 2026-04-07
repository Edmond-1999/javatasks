import java.util.Scanner;
class SumDigits {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int number = inputScanner.nextInt();
        int firstDigit = number / 10000;
        int lastDigit = number % 10;
        System.out.println(firstDigit + lastDigit);
    }
}