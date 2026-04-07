import java.util.Scanner;
class ReverseDigits {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int number = inputScanner.nextInt();
        int firstDigit = number / 10;
        int lastDigit = number % 10;
        int reversed = lastDigit * 10 + firstDigit;
        if (reversed > number) System.out.println("Larger");
        else if (reversed < number) System.out.println("Smaller");
        else System.out.println("Same");
    }
}