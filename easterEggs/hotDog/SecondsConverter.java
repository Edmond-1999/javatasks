import java.util.Scanner;
class SecondsConverter {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int seconds = inputScanner.nextInt();
        int hours = seconds / 3600;
        int remaining = seconds % 3600;
        int minutes = remaining / 60;
        int sec = remaining % 60;
        System.out.println(hours + " " + minutes + " " + sec);
    }
}