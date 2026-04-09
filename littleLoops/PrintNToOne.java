import java.util.Scanner;

public class PrintNToOne{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        for (int number = userInput; number >= 1; number--){
            System.out.println(number);
        }

    }
}
