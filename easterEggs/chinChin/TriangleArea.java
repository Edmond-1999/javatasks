import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter the base of the triangle:");
        double baseValue = inputScanner.nextDouble();
        System.out.println("Enter the height of the triangle:");
        double heightValue = inputScanner.nextDouble();

        double areaValue = 0.5 * baseValue * heightValue;
        System.out.println("The area of the triangle is: " + areaValue);
    }
}
