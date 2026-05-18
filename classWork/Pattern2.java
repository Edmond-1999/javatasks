import java.util.Scanner;
public class Pattern2{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int numberOfRows = input.nextInt();


           for (int counter = 1; counter <= numberOfRows; counter++) {
            for (int rowCounter = 1; rowCounter <= counter; rowCounter++){
                System.out.print("*");

                if(rowCounter > 1 && rowCounter < counter){
                    System.out.print("_");           
                }
            }
            System.out.println();

            for (int line = 1; line <= counter; line++){
                System.out.print("| ");
            }
            System.out.println();
        }

    }
}


