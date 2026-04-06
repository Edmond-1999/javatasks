import java.util.Scanner;

public class ATMProgram {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter your PIN:");
        int enteredPin = inputScanner.nextInt();

        if (enteredPin == 1234) {
            System.out.println("Access granted.");
            System.out.println("Your balance is: $1000");
        } else {
            System.out.println("Incorrect PIN. Access denied.");
        }
    }
}
