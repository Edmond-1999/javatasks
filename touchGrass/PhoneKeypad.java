import java.util.Scanner;

public class PhoneKeypad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String letter = input.next().toLowerCase();

        if (letter.equals("a") || letter.equals("b") || letter.equals("c")) {
            System.out.println("2");
        } else if (letter.equals("d") || letter.equals("e") || letter.equals("f")) {
            System.out.println("3");
        } else if (letter.equals("g") || letter.equals("h") || letter.equals("i")) {
            System.out.println("4");
        } else if (letter.equals("j") || letter.equals("k") || letter.equals("l")) {
            System.out.println("5");
        } else if (letter.equals("m") || letter.equals("n") || letter.equals("o")) {
            System.out.println("6");
        } else if (letter.equals("p") || letter.equals("q") || letter.equals("r") || letter.equals("s")) {
            System.out.println("7");
        } else if (letter.equals("t") || letter.equals("u") || letter.equals("v")) {
            System.out.println("8");
        } else if (letter.equals("w") || letter.equals("x") || letter.equals("y") || letter.equals("z")) {
            System.out.println("9");
        } else {
            System.out.println("Invalid input");
        }
    }
}
