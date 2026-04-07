import java.util.Scanner;
class BMICalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double weight = inputScanner.nextDouble();
        double height = inputScanner.nextDouble();
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Normal");
        } else if (bmi <= 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}