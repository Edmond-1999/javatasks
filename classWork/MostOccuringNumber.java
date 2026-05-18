public class MostOccuringNumber{
    public static int findingTheNumber(int [] array){
        int mostOccuring = array[0];
        int count = 0;
        for(int firstIndex = 0; firstIndex < array.length; firstIndex++){
            for(int secondIndex = 0; secondIndex < array.length; secondIndex++){
                if(array[firstIndex] == array[secondIndex]){
                    count++;
                }
            }
            
        }


    }
    public static void main(String[] args) {
        int[] numbers = {2, 1, 2, 5, 2, 4};
        System.out.println(findingTheNumber(numbers));
    }

}
