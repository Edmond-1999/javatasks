import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter the current hour (0-23):");
        int hourValue = inputScanner.nextInt();

        if (hourValue >= 5 && hourValue <= 11) {
            System.out.println("Good Morning!");
        } else if (hourValue <= 17) {
            System.out.println("Good Afternoon!");
        } else if (hourValue <= 21) {
            System.out.println("Good Evening!");
        } else {
            System.out.println("Good Night!");
        }
    }
}
