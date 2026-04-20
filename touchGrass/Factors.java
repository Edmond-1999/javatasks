import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int count = 1; count <= number; count++) {
            if (number % count == 0) {
                System.out.println(count);
            }
        }
    }
}
