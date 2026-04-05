import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();
        double discriminant = b * b - 4 * a * c;
        double rootOne = (-b + Math.sqrt(discriminant)) / (2 * a);
        double rootTwo = (-b - Math.sqrt(discriminant)) / (2 * a);
        System.out.println(rootOne);
        System.out.println(rootTwo);
    }
}