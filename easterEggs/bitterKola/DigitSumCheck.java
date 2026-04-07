import java.util.Scanner;
class DigitSumCheck {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int number = inputScanner.nextInt();
        int firstDigit = number / 100;
        int secondDigit = (number / 10) % 10;
        int thirdDigit = number % 10;
        int sum = firstDigit + secondDigit + thirdDigit;
        if (number % sum == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}