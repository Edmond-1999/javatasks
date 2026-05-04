import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FireDrillTest{

    @Test
    public void testTaskFour(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expected = FireDrill.taskFour(array);
        int[] actual = {1, 3, 5, 7, 9};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void testTaskFive(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expected = FireDrill.taskFive(array);
        int[] actual = {2, 4, 6, 8, 10};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void testTaskSix(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expected = FireDrill.taskSix(array);
        int actual = 25;
        assertEquals(actual, expected);
    }

    @Test
    public void testTaskSeven(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expected = FireDrill.taskSeven(array);
        int actual = 30;
        assertEquals(actual, expected);
    }

    @Test
    public void testTaskEight(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expected = FireDrill.taskEight(array);
        int actual = 1;
        assertEquals(actual, expected);
    }
}
