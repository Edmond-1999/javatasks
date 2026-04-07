import java.util.Scanner;
class DescendingOrder {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int firstNumber = inputScanner.nextInt();
        int secondNumber = inputScanner.nextInt();
        int thirdNumber = inputScanner.nextInt();
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            if (secondNumber >= thirdNumber)
                System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);
            else
                System.out.println(firstNumber + " " + thirdNumber + " " + secondNumber);
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            if (firstNumber >= thirdNumber)
                System.out.println(secondNumber + " " + firstNumber + " " + thirdNumber);
            else
                System.out.println(secondNumber + " " + thirdNumber + " " + firstNumber);
        } else {
            if (firstNumber >= secondNumber)
                System.out.println(thirdNumber + " " + firstNumber + " " + secondNumber);
            else
                System.out.println(thirdNumber + " " + secondNumber + " " + firstNumber);
        }
    }
}