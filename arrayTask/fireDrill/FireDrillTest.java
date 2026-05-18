import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FireDrillTest{

    @Test
    public void testTaskTwo(){
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = FireDrill.taskTwo(array);
        int[] actual = {5, 4, 3, 2, 1};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void testTaskThree(){
        int[] array = {1, 2, 3, 4};
        int[] expected = FireDrill.taskThree(array);
        int[] actual = {1, 3};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void testTaskFour(){
        int[] array = {1, 2, 3, 4};
        int[] expected = FireDrill.taskFour(array);
        int[] actual = {2, 4};
        assertArrayEquals(actual, expected);
    }

}
