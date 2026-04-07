import java.util.Scanner;
class RangeChecker {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int number = inputScanner.nextInt();
        if (number > 10 && number < 100) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}