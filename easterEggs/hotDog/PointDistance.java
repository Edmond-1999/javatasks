import java.util.Scanner;
class PointDistance {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double xOne = inputScanner.nextDouble();
        double yOne = inputScanner.nextDouble();
        double xTwo = inputScanner.nextDouble();
        double yTwo = inputScanner.nextDouble();
        double distance = Math.sqrt(Math.pow(xTwo - xOne, 2) + Math.pow(yTwo - yOne, 2));
        System.out.println(distance);
    }
}