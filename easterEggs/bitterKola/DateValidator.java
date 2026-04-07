import java.util.Scanner;
class DateValidator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int day = inputScanner.nextInt();
        int month = inputScanner.nextInt();
        if (month >= 1 && month <= 12 && day >= 1 && day <= 31) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}