import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int count = number; count >= 1; count--) {
            System.out.println(count);
        }

        System.out.println("Blast off!");
    }
}
