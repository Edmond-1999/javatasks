import java.util.Scanner;
class BMIImperial {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double pounds = inputScanner.nextDouble();
        double inches = inputScanner.nextDouble();
        double kilograms = pounds * 0.45359237;
        double meters = inches * 0.0254;
        double bmi = kilograms / (meters * meters);
        System.out.println(bmi);
    }
}