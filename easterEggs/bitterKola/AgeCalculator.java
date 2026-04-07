import java.util.Scanner;
class AgeCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int birthYear = inputScanner.nextInt();
        int currentYear = inputScanner.nextInt();
        int age = currentYear - birthYear;
        System.out.println(age);
        if (age > 65) {
            System.out.println("Yes");
        }
    }
}