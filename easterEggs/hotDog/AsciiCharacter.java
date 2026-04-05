import java.util.Scanner;

public class AsciiCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ASCII code: ");
        int code = input.nextInt();

        char character = (char) code;
        System.out.println("The ASCII character is" + character);
    }
}
