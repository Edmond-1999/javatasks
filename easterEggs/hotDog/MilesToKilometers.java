import java.util.Scanner;
class MilesToKilometers {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double miles = inputScanner.nextDouble();
        double kilometers = miles * 1.6;
        System.out.println(kilometers);
    }
}