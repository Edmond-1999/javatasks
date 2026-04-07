import java.util.Scanner;
class TimeAdder {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int firstHours = inputScanner.nextInt();
        int firstMinutes = inputScanner.nextInt();
        int secondHours = inputScanner.nextInt();
        int secondMinutes = inputScanner.nextInt();
        int totalMinutes = firstMinutes + secondMinutes;
        int extraHours = totalMinutes / 60;
        int remainingMinutes = totalMinutes % 60;
        int totalHours = firstHours + secondHours + extraHours;
        System.out.println(totalHours + " " + remainingMinutes);
    }
}