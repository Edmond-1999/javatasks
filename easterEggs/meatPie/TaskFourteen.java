import java.util.Scanner;
public class TaskFourteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        System.out.print("Enter the third number: ");
        int thirdNumber = input.nextInt();


        int average = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("The average is " + average);
    }
}
