import java.util.Scanner;
class TriangleAreaHeron {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double sideOne = inputScanner.nextDouble();
        double sideTwo = inputScanner.nextDouble();
        double sideThree = inputScanner.nextDouble();
        double s = (sideOne + sideTwo + sideThree) / 2;
        double area = Math.sqrt(s * (s - sideOne) * (s - sideTwo) * (s - sideThree));
        System.out.println(area);
    }
}