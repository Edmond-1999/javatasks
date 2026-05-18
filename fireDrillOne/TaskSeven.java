public class TaskSeven {
    public static void main(String[] args) {

        int firstNumber = 4;
        int firstSum = 0;

        for (int firstMultiple = 1; firstMultiple <= 1000; firstMultiple *= 4) {
            int result = firstNumber * firstMultiple;

            firstSum = firstSum + result;
        }

        System.out.print(firstSum + " ");

        int secondNumber = 8;
        int secondSum = 0;

        for (int secondMultiple = 1; secondMultiple <= 10000; secondMultiple *= 8) {
            int result = secondNumber * secondMultiple;

            secondSum = secondSum + result;
        }


        System.out.println(secondSum);
    }
}
