import java.util.Scanner;

public class ReverseArray{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int [] numbers = new int[10];
        int answer;

        for (int index = 0; index < numbers.length; index++){
            System.out.print("Enter a number: ");
            answer = input.nextInt();

            numbers[index] = answer;
        }

        int secondIndex = numbers.length - 1;

        for (int index = 0; index < numbers.length / 2; index++){

            int temp = numbers[index];
            numbers[index] = numbers[secondIndex];
            numbers[secondIndex] = temp;
            secondIndex--;
        }


        for (int count = 0; count < numbers.length; count++){
            System.out.print(numbers[count] + " ");
        }

        System.out.println();
    }
}
