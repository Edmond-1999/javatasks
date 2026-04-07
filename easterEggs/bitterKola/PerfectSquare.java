import java.util.Scanner;
class PerfectSquare {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int number = inputScanner.nextInt();
        int root = (int)Math.sqrt(number);
        if (root * root == number) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}