import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter a three-digit number:");
        int threeDigitNumber = inputScanner.nextInt();

        int hundredsPlace = threeDigitNumber / 100;
        int tensPlace = (threeDigitNumber / 10) % 10;
        int onesPlace = threeDigitNumber % 10;

        int sumOfDigits = hundredsPlace + tensPlace + onesPlace;
        System.out.println("The sum of the digits is: " + sumOfDigits);
    }
}
