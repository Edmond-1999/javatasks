import java.util.Scanner;

public class TaskTwo{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 1;


        for(count = 1; count <= 10; count++){
            System.out.print("Enter number " + count + ": ");
            int number = input.nextInt();
            sum += number;
        }
        double average = sum / (count - 1);

        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
    }

}
