import java.util.Arrays;

public class ArrayTask{
    public static void main(String[] args){


        char [][] shars = new char [3][3];



        shars[0][0] = 'X';
        shars[0][1] = 'O';
        shars[0][2] = 'X';

        shars[1][0] = 'O';
        shars[1][1] = 'O';
        shars[1][2] = 'O';

        shars[2][0] = 'X';
        shars[2][1] = 'X';
        shars[2][2] = 'O';

        System.out.println(Arrays.deepToString(shars));


        for(int index = 0; index < 3; index++){
            for(int counter = 0; counter < 3; counter++){
                System.out.print(shars[index][counter]);
            }
            System.out.println();
        }


        for(int index = 0; index < 3; index++){
            for(int counter = 0; counter < 3; counter++){
                if(shars[index][counter] == 'X'){
                    System.out.print(1);
                }
                else if(shars[index][counter] == 'O'){
                    System.out.print(0);
                }
            }
            System.out.println();
        }
        

        

        


    }

}
