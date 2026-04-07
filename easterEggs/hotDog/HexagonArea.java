import java.util.Scanner;
class HexagonArea {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double side = inputScanner.nextDouble();
        double area = (3 * Math.sqrt(3) / 2) * side * side;
        System.out.println(area);
    }
}