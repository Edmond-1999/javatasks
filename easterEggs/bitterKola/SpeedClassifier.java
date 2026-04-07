import java.util.Scanner;
class SpeedClassifier {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int speed = inputScanner.nextInt();
        if (speed == 0) {
            System.out.println("Stationary");
        } else if (speed <= 40) {
            System.out.println("Slow");
        } else if (speed <= 80) {
            System.out.println("Moderate");
        } else if (speed <= 120) {
            System.out.println("Fast");
        } else {
            System.out.println("Dangerously Fast");
        }
    }
}