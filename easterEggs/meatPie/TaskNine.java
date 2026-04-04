import java.util.Scanner;
public class TaskNine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your favourite color: ");
        String color = input.nextLine();

        System.out.println("Your favourite color is " + color);
    }
}
