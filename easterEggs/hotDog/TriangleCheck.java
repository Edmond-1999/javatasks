import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side one: ");
        double sideOne = input.nextDouble();
        System.out.print("Enter side two: ");
        double sideTwo = input.nextDouble();
        System.out.print("Enter side three: ");
        double sideThree = input.nextDouble();

        boolean valid = (sideOne + sideTwo > sideThree) &&
                        (sideOne + sideThree > sideTwo) &&
                        (sideTwo + sideThree > sideOne);

        System.out.println(valid);
    }
}