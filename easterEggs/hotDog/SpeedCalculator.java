import java.util.Scanner;

public class SpeedCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance: ");
        double distance = input.nextDouble();
        System.out.print("Enter time: ");
        double time = input.nextDouble();
        double speed = distance / time;
        System.out.println(speed);
    }
}