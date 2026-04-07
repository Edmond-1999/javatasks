import java.util.Scanner;
class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int number = inputScanner.nextInt();
        if (number % 2 == 0) System.out.println("2");
        if (number % 3 == 0) System.out.println("3");
        if (number % 5 == 0) System.out.println("5");
    }
}