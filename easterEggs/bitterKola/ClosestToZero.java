import java.util.Scanner;
class ClosestToZero {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int firstNumber = inputScanner.nextInt();
        int secondNumber = inputScanner.nextInt();
        int firstDistance = Math.abs(firstNumber);
        int secondDistance = Math.abs(secondNumber);
        if (firstDistance < secondDistance) System.out.println(firstNumber);
        else if (secondDistance < firstDistance) System.out.println(secondNumber);
        else System.out.println("Equal");
    }
}