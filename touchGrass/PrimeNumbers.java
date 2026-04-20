public class PrimeNumbers {
    public static void main(String[] args) {

        int count = 0;

        for (int number = 2; number <= 1200; number++) {

            boolean isPrime = true;

            for (int check = 2; check <= number / 2; check++) {
                if (number % check == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
                count++;

                if (count == 8) {
                    System.out.println();
                    count = 0;
                }
            }
        }
    }
}
