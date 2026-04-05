import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int number = input.nextInt();
        int digitOne = number / 100;
        int digitTwo = (number / 10) % 10;
        int digitThree = number % 10;
        int sum = digitOne + digitTwo + digitThree;
        System.out.println(sum);
    }
}