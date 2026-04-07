import java.util.Scanner;
class DayOfWeek {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int daysAhead = inputScanner.nextInt();
        int dayIndex = daysAhead % 7;
        if (dayIndex == 0) System.out.println("Monday");
        else if (dayIndex == 1) System.out.println("Tuesday");
        else if (dayIndex == 2) System.out.println("Wednesday");
        else if (dayIndex == 3) System.out.println("Thursday");
        else if (dayIndex == 4) System.out.println("Friday");
        else if (dayIndex == 5) System.out.println("Saturday");
        else System.out.println("Sunday");
    }
}