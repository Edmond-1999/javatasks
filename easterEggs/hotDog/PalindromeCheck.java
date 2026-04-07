import java.util.Scanner;
class PalindromeCheck {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int number = Math.abs(inputScanner.nextInt());
        int first = number / 100;
        int last = number % 10;
        if (first == last) System.out.println("Yes");
        else System.out.println("No");
    }
}