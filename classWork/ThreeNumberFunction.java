public class ThreeNumberFunction{
    
    public static int largestNumber(int firstNumber, int secondNumber, int thirdNumber){
        int largest = firstNumber;

        if (secondNumber > largest){
            largest = secondNumber;
        }

        if (thirdNumber > largest){
            largest = thirdNumber;
        }

        return largest;

    }

    public static void main(String[] args){

        System.out.println("The largest is " + largestNumber(12, 25, 37));

    }

}
