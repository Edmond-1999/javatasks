import java.util.Scanner;
public class Pattern{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int numberOfRows = input.nextInt();


           for (int counter = 1; counter <= numberOfRows; counter++) {
            for (int column = 1; column <= numberOfRows - counter; column++){
                System.out.print(" ");
            }
            for (int rowCounter = 1; rowCounter <= counter; rowCounter++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


