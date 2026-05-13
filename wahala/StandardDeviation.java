public class StandardDeviation{

    public static int sumOfNumbers(int[] array){
        int sum = 0;

        for(int index = 0; index < array.length; index++){
            sum += array[index];
        }

        return sum;
    }

    public static double meanOfNumbers(int[] array){
        int sum = sumOfNumbers(array);
        int frequency = array.length;
        double mean = sum / frequency;
        return mean;
    }

    public static double sumOfMeanDeviationOfNumbers(int[] array){
        double sumOfMeanDeviation = 0;
        double meanDeviation;
        double meanOfNumbers = meanOfNumbers(array);
        for(int index = 0; index < array.length; index++){
            meanDeviation = Math.abs(array[index] - meanOfNumbers);
            sumOfMeanDeviation += meanDeviation;
        }
        return sumOfMeanDeviation;
    }

    public static double variance(int[] array){
        double sumOfMeanDeviation = sumOfMeanDeviationOfNumbers(array);
        int frequency = array.length;
        double variance = sumOfMeanDeviation / frequency;
        return variance;
    }

    public static double standardDeviation(int[] array){
        double variance = variance(array);
        double standardDeviation = Math.sqrt(variance);
        return Math.round(standardDeviation * 1000.0) / 1000.0;

    }

}
