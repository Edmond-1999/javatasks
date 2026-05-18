import java.util.Scanner;
import java.util.Arrays;

public class KataKata{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] array = new int [10];

        int number;


        for(int index = 0; index < 10; index++){
            System.out.print("Enter a number: ");
            number = input.nextInt();

            array[index] = number; 

        }

//        System.out.println(Arrays.toString(array));


        for(int index = 0; index < 10; index++){
            System.out.print(array[index]);
        }
    }

}
