import java.util.Scanner;
class SumFormula {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int number = inputScanner.nextInt();
        int result = number * (number + 1) / 2;
        System.out.println(result);
    }
}