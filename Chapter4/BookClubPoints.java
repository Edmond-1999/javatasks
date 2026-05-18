import java.util.Scanner;

public class BookClubPoints {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of books purchased: ");
        int booksPurchased = input.nextInt();

        int points;

        if (booksPurchased == 0) {
            points = 0;
        } else if (booksPurchased == 1) {
            points = 5;
        } else if (booksPurchased == 2) {
            points = 15;
        } else if (booksPurchased == 3) {
            points = 30;
        } else {
            points = 60;
        }

        System.out.println("Points earned: " + points);
    }
}
