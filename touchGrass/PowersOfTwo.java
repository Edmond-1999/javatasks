import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int limit = input.nextInt();

        int value = 1;

        for (int count = 0; count < limit; count++) {
            System.out.println(value);
            value = value * 2;
        }
    }
}
