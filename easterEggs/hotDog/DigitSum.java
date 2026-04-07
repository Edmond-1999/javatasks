import java.util.Scanner;
class DigitSum {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int number = inputScanner.nextInt();
        int first = number / 100;
        int second = (number / 10) % 10;
        int third = number % 10;
        System.out.println(first + second + third);
    }
}