import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter month: ");
        int monthValue = inputScanner.nextInt();

        System.out.print("Enter year: ");
        int yearValue = inputScanner.nextInt();

        int numberOfDays;

        if (monthValue == 2) {
            if ((yearValue % 4 == 0 && yearValue % 100 != 0) || (yearValue % 400 == 0)) {
                numberOfDays = 29;
            } else {
                numberOfDays = 28;
            }
        } else if (monthValue == 4 || monthValue == 6 || monthValue == 9 || monthValue == 11) {
            numberOfDays = 30;
        } else {
            numberOfDays = 31;
        }

        System.out.println("Days: " + numberOfDays);
    }
}
