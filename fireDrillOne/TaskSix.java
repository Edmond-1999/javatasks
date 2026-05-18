public class TaskSix{
    public static void main(String[] args){
        
        int firstNumber = 4;

       

        for( int firstMultiple = 1 ; firstMultiple <= 1000 ; firstMultiple *= 4){
        System.out.print(firstNumber * firstMultiple + " ");
        }

        int secondNumber = 8;


        for (int secondMultiple = 1 ; secondMultiple <= 10000; secondMultiple *= 8){
            System.out.print(secondNumber * secondMultiple + " ");
        }
        System.out.print(" ");

    }

}
