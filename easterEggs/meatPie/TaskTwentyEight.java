import java.util.Scanner;
public class TaskTwentyEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ")
        int number = input.nextInt();

        int division = number / 3;
        System.out.println("The number divided by three is " + division);
    }
}
