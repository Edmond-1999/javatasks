import java.util.Scanner;
class QuadraticSolver {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double a = inputScanner.nextDouble();
        double b = inputScanner.nextDouble();
        double c = inputScanner.nextDouble();
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double rootOne = (-b + Math.sqrt(discriminant)) / (2 * a);
            double rootTwo = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println(rootOne);
            System.out.println(rootTwo);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println(root);
        } else {
            System.out.println("No roots");
        }
    }
}