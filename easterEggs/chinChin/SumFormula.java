import java.util.Scanner;

public class SumFormula {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int numberValue = inputScanner.nextInt();

        int resultSum = (numberValue * (numberValue + 1)) / 2;
        System.out.println("The sum from 1 to " + numberValue + " is: " + resultSum);
    }
}
