import java.util.Arrays;

public class FireDrill{
    public static int[] taskFour(int[] array){
        int [] newArray = new int[array.length / 2];
        int counter = 0;
        int index = 0;
        for(counter = 0; counter < newArray.length; counter++){
            newArray[counter] = array[index];
            index+=2;
        }
        return newArray;
    }

    public static int[] taskFive(int[] array){
        int [] newArray = new int[array.length / 2];
        int counter = 0;
        int index = 1;
        for(counter = 0; counter < newArray.length; counter++){
            newArray[counter] = array[index];
            index+=2;
        }
        return newArray;
    }

    public static int taskSix(int[] array){
        int [] newArray = new int[array.length / 2];
        int counter = 0;
        int index = 0;
        for(counter = 0; counter < newArray.length; counter++){
            newArray[counter] = array[index];
            index+=2;
        }
        int sum = 0;
        for(int i = 0; i < newArray.length; i++){
            sum += newArray[i];
        }
        return sum;
    }

    public static int taskSeven(int[] array){
        int [] newArray = new int[array.length / 2];
        int counter = 0;
        int index = 1;
        for(counter = 0; counter < newArray.length; counter++){
            newArray[counter] = array[index];
            index+=2;
        }
        int sum = 0;
        for(int i = 0; i < newArray.length; i++){
            sum += newArray[i];
        }
        return sum;
    }

    public static int taskEight(int[] array){
        int [] newArray = new int[array.length / 2];
        int counter = 0;
        int index = 0;
        for(counter = 0; counter < newArray.length; counter++){
            newArray[counter] = array[index];
            index+=2;
        }

        int smallest = newArray[0];
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] < smallest) {
                smallest = newArray[i];
            }
        }
        return smallest;
    }
}
