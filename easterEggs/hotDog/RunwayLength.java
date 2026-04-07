import java.util.Scanner;
class RunwayLength {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double velocity = inputScanner.nextDouble();
        double acceleration = inputScanner.nextDouble();
        double length = velocity * velocity / (2 * acceleration);
        System.out.println(length);
    }
}