import java.util.Scanner;
class CompoundInterest {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double balance = inputScanner.nextDouble();
        double rate = inputScanner.nextDouble();
        double yearOne = balance * (1 + rate);
        double yearTwo = yearOne * (1 + rate);
        double yearThree = yearTwo * (1 + rate);
        System.out.println(yearOne);
        System.out.println(yearTwo);
        System.out.println(yearThree);
    }
}