import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter a four-digit number:");
        int fourDigitNumber = inputScanner.nextInt();

        int firstDigit = fourDigitNumber / 1000;
        int secondDigit = (fourDigitNumber / 100) % 10;
        int thirdDigit = (fourDigitNumber / 10) % 10;
        int fourthDigit = fourDigitNumber % 10;

        int reversedNumber = (fourthDigit * 1000) + (thirdDigit * 100) + (secondDigit * 10) + firstDigit;
        System.out.println("The reversed number is: " + reversedNumber);
    }
}
