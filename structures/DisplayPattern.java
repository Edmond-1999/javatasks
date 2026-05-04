public class DisplayPattern {

    public static void displayPattern(int number) {
        for (int row = 1; row <= number; row++) {
            for (int space = number; space > row; space--) {
                System.out.print("  ");
            }
            for (int value = row; value >= 1; value--) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        displayPattern(5);
    }
}
