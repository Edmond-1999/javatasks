import java.util.Scanner;

public class ImpromptuTask{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int numberLength = String.valueOf(number).length();
        int sumOfNumbers = 0;

        for(int count = 0; count < numberLength; count++){
            int remainder = number % 10;
            number = number / 10;
            sumOfNumbers += remainder;
        }
        System.out.println("The sum is " + sumOfNumbers);
    }

}
