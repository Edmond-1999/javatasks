import java.util.Scanner;

public class PolygonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of sides: ");
        int numberOfSides = input.nextInt();
        System.out.print("Enter side length: ");
        double sideLength = input.nextDouble();
        double area = (numberOfSides * sideLength * sideLength) /
                      (4 * Math.tan(Math.PI / numberOfSides));
        System.out.println(area);
    }
}