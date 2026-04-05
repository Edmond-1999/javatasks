import java.util.Scanner;

public class MassAndWeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter mass: ");
        double mass = input.nextDouble();
        double gravity = 9.8;
        double weight = mass * gravity;
        System.out.println(weight);
    }
}