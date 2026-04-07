import java.util.Scanner;
class TimeConverter {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int totalMinutes = inputScanner.nextInt();
        int days = totalMinutes / 1440;
        int remainingAfterDays = totalMinutes % 1440;
        int hours = remainingAfterDays / 60;
        int minutes = remainingAfterDays % 60;
        System.out.println(days + " " + hours + " " + minutes);
    }
}