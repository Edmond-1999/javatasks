import java.util.Scanner;
class TriangleType {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double a = inputScanner.nextDouble();
        double b = inputScanner.nextDouble();
        double c = inputScanner.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) System.out.println("Equilateral");
            else if (a == b || b == c || a == c) System.out.println("Isosceles");
            else System.out.println("Scalene");
        } else System.out.println("Invalid");
    }
}