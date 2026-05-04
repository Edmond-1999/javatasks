public class ReverseNumber {

    public static int reverse(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static void main(String[] args) {
        int number = 121;

        System.out.println("Reversed: " + reverse(number));
        System.out.println("Is Palindrome: " + isPalindrome(number));
    }
}
