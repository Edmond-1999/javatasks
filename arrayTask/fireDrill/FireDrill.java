import java.util.Arrays;

public class FireDrill{

    public static int[] taskTwo(int[] array){
         int secondIndex = array.length - 1;

        for (int index = 0; index < array.length / 2; index++){

            int temp = array[index];
            array[index] = array[secondIndex];
            array[secondIndex] = temp;
            secondIndex--;
        }
        return array;

    }

    public static int[] taskThree(int[] array){
        int[] newArray = new int[array.length / 2];
        int secondIndex = 0;

        for(int index = 0; index < array.length; index++){
            if(array[index] % 2 != 0){
                newArray[secondIndex] = array[index];
                secondIndex++;
            }
        }
        return newArray;
    }

    public static int[] taskFour(int[] array){
        int[] newArray = new int[array.length / 2];
        int secondIndex = 0;

        for(int index = 0; index < array.length; index++){
            if(array[index] % 2 == 0){
                newArray[secondIndex] = array[index];
                secondIndex++;
            }
        }
        return newArray;
    }

    public static int[] taskFive(int[] array){

        int count = 0;
        
        for(int index1 = 0; index1 < array.length; index1++){

            boolean ifNotDuplicate = false;
            
            for(int index2 = 0; index2 < array.length; index2++){
                if(array[index1] != array[index2]){
                    ifNotDuplicate = true;
                    break;
                }
            }
            if(!ifNotDuplicate){
                count++;
            }
        }

        int[] newArray = new int[count];
        int anotherIndex = 0;

        for(int index = 0; index < array.length; index++){
            boolean ifNotDuplicate = false;
            
            for(int index2 = 0; index2 < array.length; index2++){
                if(array[index] != array[index2]){
                    ifNotDuplicate = true;
                    break;
                }
            }
            if(!ifNotDuplicate){
                newArray[anotherIndex] = array[index];
                anotherIndex++;
            }
        }
        return newArray;
        

    }

    public static void main(String[] arg){
        int[] array = {1, 2, 2, 3, 4, 5, 5};

        System.out.print(Arrays.toString(taskFive(array)));
    }

}
