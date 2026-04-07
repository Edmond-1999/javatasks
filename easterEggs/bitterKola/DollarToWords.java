import java.util.Scanner;
class DollarToWords {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int amount = inputScanner.nextInt();
        if (amount == 1) System.out.println("one");
        else if (amount == 2) System.out.println("two");
        else if (amount == 3) System.out.println("three");
        else if (amount == 4) System.out.println("four");
        else if (amount == 5) System.out.println("five");
        else System.out.println("other");
    }
}