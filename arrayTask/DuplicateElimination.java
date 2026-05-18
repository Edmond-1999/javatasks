import java.util.Scanner;
import java.util.Arrays;

public class DuplicateElimination{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int [] numbers = new int [10];
        int answer;

        int index = 0;

        while(index < 10){
            System.out.print("Enter a number between 10 and 100: ");
            answer = input.nextInt();
            if(answer >= 10 && answer <= 100){
                for(int number : numbers){
                    if(number != answer){
                        numbers[index] = answer;
                        index++;
                    }
                    else{
                        System.out.println("Input already in array");
                    }
                }

            }
            else{
                System.out.println("Invalid Input");
            }

        }

        System.out.print(Arrays.toString(numbers));



        

    }
}
