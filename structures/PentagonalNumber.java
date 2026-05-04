public class PentagonalNumber {

    public static int getPentagonalNumber(int number) {
        return number * (3 * number - 1) / 2;
    }

    public static void main(String[] args) {
        int result = getPentagonalNumber(5);
        System.out.println("Pentagonal number: " + result);
    }
}
