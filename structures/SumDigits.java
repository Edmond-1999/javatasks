public class SumDigits {

    public static int sumDigits(int number) {
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int result = sumDigits(12345);
        System.out.println("Sum of digits: " + result);
    }
}
