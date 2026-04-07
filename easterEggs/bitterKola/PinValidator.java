import java.util.Scanner;
class PinValidator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int pin = inputScanner.nextInt();
        if (pin >= 1000 && pin <= 9999) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}