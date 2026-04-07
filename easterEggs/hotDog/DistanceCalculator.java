import java.util.Scanner;
class DistanceCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double velocity = inputScanner.nextDouble();
        double time = inputScanner.nextDouble();
        double acceleration = inputScanner.nextDouble();
        double distance = velocity * time + 0.5 * acceleration * time * time;
        System.out.println(distance);
    }
}