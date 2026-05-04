import java.util.Scanner;

public class TaskOne{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int [] array = new int [10];
        int number;

        for(int index = 0; index < array.length; index++){
            System.out.print("Enter a number: ");
            number = input.nextInt();
            array[index] = number;

        }
        

    }

}
