public class SeriesSum {
    public static void main(String[] args) {

        double sum = 0.0;

        for (int number = 1; number <= 97; number = number + 2) {
            sum = sum + (double) number / (number + 2);
        }

        System.out.println("Sum: " + sum);
    }
}
