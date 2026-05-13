import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StandardDeviationTest{

    @Test
    public void testSumOfNumbers(){
        int[] array = {1, 2, 3, 4, 5};
        int expected = StandardDeviation.sumOfNumbers(array);
        int actual = 15;
        assertEquals(actual, expected);
    }

    @Test
    public void testMeanOfNumbers(){
        int[] array = {1, 2, 3, 4, 5};
        double expected = StandardDeviation.meanOfNumbers(array);
        double actual = 3;
        assertEquals(actual, expected);
    }

    @Test
    public void testMeanDeviationOfNumbers(){
        int[] array = {1, 2, 3, 4, 5};
        double expected = StandardDeviation.sumOfMeanDeviationOfNumbers(array);
        double actual = 6;
        assertEquals(actual, expected);
    }

    @Test
    public void testVariance(){
        int[] array = {1, 2, 3, 4, 5};
        double expected = StandardDeviation.variance(array);
        double actual = 1.2;
        assertEquals(actual, expected);
    }

    @Test
    public void testStandardDeviation(){
        int[] array = {1, 2, 3, 4, 5};
        double expected = StandardDeviation.standardDeviation(array);
        double actual = 1.095;
        assertEquals(actual, expected);
    }

}
