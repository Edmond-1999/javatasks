import java.util.Scanner;
class MinutesToYearsDays {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int minutes = inputScanner.nextInt();
        int years = minutes / (60 * 24 * 365);
        int remaining = minutes % (60 * 24 * 365);
        int days = remaining / (60 * 24);
        System.out.println(years);
        System.out.println(days);
    }
}