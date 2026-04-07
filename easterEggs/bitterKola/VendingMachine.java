import java.util.Scanner;
class VendingMachine {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int code = inputScanner.nextInt();
        int paid = inputScanner.nextInt();
        int price;
        if (code == 1) price = 100;
        else if (code == 2) price = 200;
        else if (code == 3) price = 150;
        else price = 300;
        if (paid >= price) {
            System.out.println(paid - price);
        } else {
            System.out.println("No");
        }
    }
}