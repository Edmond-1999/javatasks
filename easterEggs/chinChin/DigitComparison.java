import java.util.Scanner;

public class DigitComparison {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter a two-digit number:");
        int twoDigitNumber = inputScanner.nextInt();

        int tensDigit = twoDigitNumber / 10;
        int onesDigit = twoDigitNumber % 10;

        if (tensDigit > onesDigit) {
            System.out.println("The tens digit is greater than the ones digit.");
        } else if (tensDigit < onesDigit) {
            System.out.println("The tens digit is less than the ones digit.");
        } else {
            System.out.println("Both digits are equal.");
        }
    }
}
