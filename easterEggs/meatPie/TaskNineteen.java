import java.util.Scanner;
public class TaskNineteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ")
        int number = input.nextInt();

        double remainder = number % 2;
        System.out.println("The remainder of the number divided by two is " + remainder);
    }
}
