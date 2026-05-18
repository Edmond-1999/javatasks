import java.util.Scanner;

public class SquareOfSeperation{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int numberLength = String.valueOf(number).length();

        for(int count = 0; count < numberLength; count++){
            int remainder = number % 10;
            number = number / 10;
            System.out.println(remainder * remainder);
        }

    }

}
