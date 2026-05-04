public class DisplayReverse {

    public static void reverse(int number) {
        while (number != 0) {
            int digit = number % 10;
            System.out.print(digit);
            number /= 10;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        reverse(12345);
    }
}
