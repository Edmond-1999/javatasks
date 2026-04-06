import java.util.Scanner;

public class ThreeDigitCheck {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int numberValue = inputScanner.nextInt();

        if (numberValue >= 100 && numberValue <= 999) {
            System.out.println("The number is a three-digit number.");
        } else {
            System.out.println("The number is NOT a three-digit number.");
        }
    }
}
