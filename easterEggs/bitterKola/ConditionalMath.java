import java.util.Scanner;
class ConditionalMath {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int firstNumber = inputScanner.nextInt();
        int secondNumber = inputScanner.nextInt();
        if (firstNumber > 0 && secondNumber > 0) {
            System.out.println(firstNumber + secondNumber);
        } else if (firstNumber < 0 && secondNumber < 0) {
            System.out.println(firstNumber * secondNumber);
        } else {
            System.out.println(Math.abs(firstNumber - secondNumber));
        }
    }
}