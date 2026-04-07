import java.util.Scanner;
class LeapYear {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int year = inputScanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println("Yes");
        else System.out.println("No");
    }
}