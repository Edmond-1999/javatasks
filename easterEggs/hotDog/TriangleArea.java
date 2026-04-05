import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side one: ");
        double sideOne = input.nextDouble();
        System.out.print("Enter side two: ");
        double sideTwo = input.nextDouble();
        System.out.print("Enter side three: ");
        double sideThree = input.nextDouble();
        double s = (sideOne + sideTwo + sideThree) / 2;
        double area = Math.sqrt(s * (s - sideOne) * (s - sideTwo) * (s - sideThree));
        System.out.println(area);
    }
}