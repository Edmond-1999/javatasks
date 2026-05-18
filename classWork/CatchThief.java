import java.util.Scanner;

public class CatchThief{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        int number = 1;
        while(number == 1){
            System.out.print("Enter your say: ");
            String word = input.nextLine();

            switch(word.toLowerCase().trim()){
                case "thief" -> {
                    System.out.println("Thief ooooo!!! Catch Am!!!");
                    number = 3;

                }

                default -> {
                    System.out.println("Not yet");

                }
            
            }
        }

    }

}
