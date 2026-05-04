public class DisplaySortedNumbers {

    public static void displaySortedNumbers(double firstNumber, double secondNumber, double thirdNumber) {
        double temp;

        if (firstNumber < secondNumber) {
            temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }

        if (firstNumber < thirdNumber) {
            temp = firstNumber;
            firstNumber = thirdNumber;
            thirdNumber = temp;
        }

        if (secondNumber < thirdNumber) {
            temp = secondNumber;
            secondNumber = thirdNumber;
            thirdNumber = temp;
        }

        System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);
    }

    public static void main(String[] args) {
        displaySortedNumbers(3.2, 5.6, 1.8);
    }
}
