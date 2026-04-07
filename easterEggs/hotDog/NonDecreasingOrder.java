import java.util.Scanner;
class NonDecreasingOrder {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int a = inputScanner.nextInt();
        int b = inputScanner.nextInt();
        int c = inputScanner.nextInt();
        if (a <= b && a <= c) {
            if (b <= c) System.out.println(a + " " + b + " " + c);
            else System.out.println(a + " " + c + " " + b);
        } else if (b <= a && b <= c) {
            if (a <= c) System.out.println(b + " " + a + " " + c);
            else System.out.println(b + " " + c + " " + a);
        } else {
            if (a <= b) System.out.println(c + " " + a + " " + b);
            else System.out.println(c + " " + b + " " + a);
        }
    }
}