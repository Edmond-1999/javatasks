import java.util.Scanner;
class SquareMetersToPing {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double squareMeters = inputScanner.nextDouble();
        double ping = squareMeters * 0.3025;
        System.out.println(ping);
    }
}