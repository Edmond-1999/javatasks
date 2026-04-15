import java.util.Scanner;

public class TaskSeven{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 1;
        int totalEvenNumbers = 0;

        for(count = 1; count <= 10; count++){
            System.out.print("Enter number " + count + ": ");
            int number = input.nextInt();
            if(number % 2 == 0){
                sum += number;
                totalEvenNumbers++;
            }
        }
        double average = sum / totalEvenNumbers;

        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
    }

} 
