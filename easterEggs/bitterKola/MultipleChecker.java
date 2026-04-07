import java.util.Scanner;
class MultipleChecker {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int firstNumber = inputScanner.nextInt();
        int secondNumber = inputScanner.nextInt();
        if (firstNumber % secondNumber == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}