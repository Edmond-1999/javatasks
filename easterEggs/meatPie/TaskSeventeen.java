import java.util.Scanner;
public class TaskSeventeen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number");
        int number = input.nextInt();

        int addition = number + 10;
        System.out.println("The number when 10 is added is " + addition);
    }
}
