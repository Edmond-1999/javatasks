import java.util.Scanner;

public class MinutesConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter minutes: ");
        int minutes = input.nextInt();
        int days = minutes / (60 * 24);
        int years = days / 365;
        int remainingDays = days % 365;
        System.out.println(years + " years and " + remainingDays + " days");
    }
}