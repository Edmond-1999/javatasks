import java.util.Scanner;
public class TaskEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int cube =  number * number * number
        System.out.println("The cube is " + cube);
    }
}
