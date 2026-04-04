import java.util.Scanner;
public class TaskSixteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number");
        int number = input.nextInt();

        int multiple = number * 5;
        System.out.println("The multiple of the number is" + multiple);
    }
}
