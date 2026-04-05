import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        boolean result = number % 5 == 0 && number % 6 == 0;
        System.out.println(result);
    }
}