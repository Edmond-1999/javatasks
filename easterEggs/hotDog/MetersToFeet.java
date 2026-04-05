import java.util.Scanner;

public class MetersToFeet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter meters: ");
        double meters = input.nextDouble();
        double feet = meters * 3.28084;
        System.out.println(feet);
    }
}