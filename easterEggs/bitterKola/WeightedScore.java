import java.util.Scanner;
class WeightedScore {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double a = inputScanner.nextDouble();
        double b = inputScanner.nextDouble();
        double c = inputScanner.nextDouble();
        double highest;
        double middle;
        double lowest;
        if (a >= b && a >= c) {
            highest = a;
            if (b >= c) { middle = b; lowest = c; }
            else { middle = c; lowest = b; }
        } else if (b >= a && b >= c) {
            highest = b;
            if (a >= c) { middle = a; lowest = c; }
            else { middle = c; lowest = a; }
        } else {
            highest = c;
            if (a >= b) { middle = a; lowest = b; }
            else { middle = b; lowest = a; }
        }
        double result = highest * 0.4 + middle * 0.35 + lowest * 0.25;
        System.out.println(result);
    }
}