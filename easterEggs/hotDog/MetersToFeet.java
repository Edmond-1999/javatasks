import java.util.Scanner;
class MetersToFeet {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double meters = inputScanner.nextDouble();
        double feet = meters * 3.2786;
        System.out.println(feet);
    }
}