import java.util.Scanner;
class FactorChecker {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int firstNumber = inputScanner.nextInt();
        int secondNumber = inputScanner.nextInt();
        if (secondNumber % firstNumber == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}