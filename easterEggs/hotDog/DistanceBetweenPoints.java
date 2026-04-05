import java.util.Scanner;

public class DistanceBetweenPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double xOne = input.nextDouble();
        System.out.print("Enter y1: ");
        double yOne = input.nextDouble();
        System.out.print("Enter x2: ");
        double xTwo = input.nextDouble();
        System.out.print("Enter y2: ");
        double yTwo = input.nextDouble();
        double distance = Math.sqrt(Math.pow(xTwo - xOne, 2) + Math.pow(yTwo - yOne, 2));
        System.out.println(distance);
    }
}