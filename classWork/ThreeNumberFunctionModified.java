public class ThreeNumberFunctionModified{

    public static int comparison(int currentLargest, int newNumber){
        if (newNumber > currentLargest){
            return newNumber;
        }
        return currentLargest;
    }

    public static int findLargest(int counter, int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber, int sixthNumber){

        int largest = firstNumber;

        int[] temporaryArray = {secondNumber, thirdNumber, fourthNumber, fifthNumber, sixthNumber};

        for (int i = 0; i < counter - 1; i++){
            largest = comparison(largest, temporaryArray[i]);
        }

        return largest;
    }

    public static void main(String[] args) {
        System.out.println("The largest is " + findLargest(6, 26, 46, 67, 54, 3, 77));
    }
}
