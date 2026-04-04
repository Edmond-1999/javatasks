import java.util.Scanner;
public class TaskTwentyFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second number:");
        int secondNumber = input.nextInt();


        int temporary = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temporary;

        System.out.println("The first number swapped is " + firstNumber);
        System.out.println("The second number swapped is " + secondNumber);
    }
}
