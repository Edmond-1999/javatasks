import java.util.Scanner;
class InsuranceCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double salary = inputScanner.nextDouble();
        double deduction;
        if (salary <= 50000) deduction = 0;
        else if (salary <= 150000) deduction = salary * 0.05;
        else if (salary <= 500000) deduction = salary * 0.075;
        else deduction = salary * 0.1;
        System.out.println(deduction);
    }
}