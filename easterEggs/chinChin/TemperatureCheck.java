import java.util.Scanner;

public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius:");
        double temperatureValue = inputScanner.nextDouble();

        if (temperatureValue < 0) {
            System.out.println("The temperature is Freezing.");
        } else if (temperatureValue <= 15) {
            System.out.println("The temperature is Cold.");
        } else if (temperatureValue <= 25) {
            System.out.println("The temperature is Warm.");
        } else {
            System.out.println("The temperature is Hot.");
        }
    }
}
