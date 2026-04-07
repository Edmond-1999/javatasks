import java.util.Scanner;
class EnergyCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double water = inputScanner.nextDouble();
        double initialTemperature = inputScanner.nextDouble();
        double finalTemperature = inputScanner.nextDouble();
        double energy = water * (finalTemperature - initialTemperature) * 4184;
        System.out.println(energy);
    }
}