import java.util.Scanner;
public class TaskTwentyOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base:");
        int base = input.nextInt();

        System.out.print("Enter the height:");
        int height = input.nextInt();

        int area = (base * height) / 2;
        System.out.println(("The area is " + area);
    }
}
