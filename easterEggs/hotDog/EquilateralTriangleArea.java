import java.util.Scanner;
class EquilateralTriangleArea {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double side = inputScanner.nextDouble();
        double area = (Math.sqrt(3) / 4) * side * side;
        System.out.println(area);
    }
}