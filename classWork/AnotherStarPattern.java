public class AnotherStarPattern{
    public static void main(String[] args){

        int numberOfRows = 5;

        for (int counter = 1; counter <= numberOfRows; counter++) {
            for (int rowCounter = 1; rowCounter <= counter; rowCounter++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int counter = numberOfRows - 1; counter >= 1; counter--){
            for(int rowCounter = 1; rowCounter <= counter; rowCounter++){
                System.out.print("*");
            }
            System.out.println();
        }
           
        
    }

}
