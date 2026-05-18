import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temperature = input.nextDouble();

        System.out.print("Convert to (C/F): ");
        char choice = input.next().charAt(0);

        if (choice == 'C' || choice == 'c') {
            double result = (temperature - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + result);
        } else if (choice == 'F' || choice == 'f') {
            double result = (temperature * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + result);
        } else {
            System.out.println("Invalid choice");
        }
    }
}
