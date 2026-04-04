import java.util.Scanner;
public class TaskThirty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        int sum = firstNumber + secondNumber;
        int product = firstNumber * secondNumber;

        System.out.println("The sum is " + sum);
        System.out.println("The product is " + product);
    }
}
