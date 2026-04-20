public class Kata {

    public static void main(String[] args) {

        System.out.println("Max: " + max(5, 10));
        System.out.println("Is Even (4): " + isEven(4));
        System.out.println("Is Prime (7): " + isPrimeNumber(7));
        System.out.println("Subtract (7, 3): " + subtract(7, 3));
        System.out.println("Divide (10, 2): " + divide(10, 2));
        System.out.println("Factors of 10: " + factorOf(10));
        System.out.println("Is Perfect Square (25): " + isPerfectSquare(25));
        System.out.println("Is Palindrome (54145): " + isPalindrome(54145));
        System.out.println("Factorial of 5: " + factorialOf(5));
        System.out.println("Square of 5: " + squareOf(5));
    }


    public static int max(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }

        for (int count = 2; count < number; count++) {
            if (number % count == 0) {
                return false;
            }
        }

        return true;
    }

    public static int subtract(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber - secondNumber;
        } else {
            return secondNumber - firstNumber;
        }
    }

    public static float divide(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return 0;
        }

        return (float) firstNumber / secondNumber;
    }

    public static int factorOf(int number) {
        int countFactors = 0;

        for (int count = 1; count <= number; count++) {
            if (number % count == 0) {
                countFactors = countFactors + 1;
            }
        }

        return countFactors;
    }

    public static boolean isPerfectSquare(int number) {
        for (int count = 1; count * count <= number; count++) {
            if (count * count == number) {
                return true;
            }
        }

        return false;
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        for (; number > 0; number = number / 10) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }

        if (originalNumber == reversedNumber) {
            return true;
        } else {
            return false;
        }
    }

    public static long factorialOf(int number) {
        long result = 1;

        for (int count = 1; count <= number; count++) {
            result = result * count;
        }

        return result;
    }

    public static long squareOf(int number) {
        return number * number;
    }

}
