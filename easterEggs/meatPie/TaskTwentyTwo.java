import java.util.Scanner;
public class TaskTwentyTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ")
        int radius = input.nextInt();

        double area = 3.14 * radius * radius;
        System.out.println("The area is " + area);
    }
}
