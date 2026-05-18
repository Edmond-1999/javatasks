import java.util.Scanner;

public class SumOfFactors{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int count = 2;
        int sum = 0;



        for(count = 2; count <= number;){
            if (number % count == 0) {
                number = number / count;
                sum = sum + count;
              
            }
            else {
                count++;
            }


        }


        System.out.println("The sum of factors is " + sum);


    }

}
