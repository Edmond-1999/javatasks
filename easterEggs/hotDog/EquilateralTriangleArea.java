import java.util.Scanner;

public class EquilateralTriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side length: ");
        double sideLength = input.nextDouble();
        double area = (Math.sqrt(3) / 4) * sideLength * sideLength;
        System.out.println(area);
    }
}