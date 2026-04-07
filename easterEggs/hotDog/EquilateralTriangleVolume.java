import java.util.Scanner;
class EquilateralTriangleVolume {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double side = inputScanner.nextDouble();
        double volume = side * side * side;
        System.out.println(volume);
    }
}