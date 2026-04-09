import java.util.Scanner;

public class PrintOneToN{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        for (int number = 1; number <= userInput; number++){
            System.out.println(number);
        }

    }
}
