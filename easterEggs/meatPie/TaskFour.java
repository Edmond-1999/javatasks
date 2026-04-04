import java.util.Scanner;

public class TaskFour{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        int difference = firstNumber - secondNumber;

        System.out.println("The difference is " + difference);

    }

}
