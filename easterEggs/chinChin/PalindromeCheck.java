import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter a three-digit number:");
        int numberValue = inputScanner.nextInt();

        int firstDigit = numberValue / 100;
        int lastDigit = numberValue % 10;

        if (firstDigit == lastDigit) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is NOT a palindrome.");
        }
    }
}
