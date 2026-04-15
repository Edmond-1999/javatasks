import java.util.Scanner;

public class TaskFive{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int sum = 0;

        for(int count = 1; count <= 10; count++){
            System.out.print("Enter number " + count + ": ");
            int number = input.nextInt();
            if(number % 2 == 0){
                sum += number;
            }
        }
        System.out.println("The sum is " + sum);
    }

}
