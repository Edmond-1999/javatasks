import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters: ");
        String data = input.next().toUpperCase();

        if (data.equals("I1")) {
            System.out.println("Information Management Freshman");
        } else if (data.equals("I2")) {
            System.out.println("Information Management Sophomore");
        } else if (data.equals("I3")) {
            System.out.println("Information Management Junior");
        } else if (data.equals("I4")) {
            System.out.println("Information Management Senior");
        } else if (data.equals("C1")) {
            System.out.println("Computer Science Freshman");
        } else if (data.equals("C2")) {
            System.out.println("Computer Science Sophomore");
        } else if (data.equals("C3")) {
            System.out.println("Computer Science Junior");
        } else if (data.equals("C4")) {
            System.out.println("Computer Science Senior");
        } else if (data.equals("A1")) {
            System.out.println("Accounting Freshman");
        } else if (data.equals("A2")) {
            System.out.println("Accounting Sophomore");
        } else if (data.equals("A3")) {
            System.out.println("Accounting Junior");
        } else if (data.equals("A4")) {
            System.out.println("Accounting Senior");
        } else {
            System.out.println("Invalid input");
        }
    }
}
