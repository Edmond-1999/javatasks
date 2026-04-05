import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter year: ");
        int year = input.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(isLeap);
    }
}
