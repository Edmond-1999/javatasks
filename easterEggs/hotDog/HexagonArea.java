import java.util.Scanner;

public class HexagonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side length: ");
        double sideLength = input.nextDouble();
        double area = (3 * Math.sqrt(3) / 2) * sideLength * sideLength;
        System.out.println(area);
    }
}