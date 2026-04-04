import java.util.Scanner;
public class TaskTen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ")
        int number = input.nextInt();

        int doubleOfNumber = number * 2;
        System.out.println("The double is " + doubleOfNumber);
    }
}
