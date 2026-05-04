import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BackToSenderTest {

    @Test
    public void testLessThan50Percent() {
        int expected = BackToSender.calculateWage(25);
        assertEquals(9000, expected);
    }

    @Test
    public void test50To59Percent() {
        int expected = BackToSender.calculateWage(55);
        assertEquals(16000, expected);
    }

    @Test
    public void test60To69Percent() {
        int expected = BackToSender.calculateWage(65);
        assertEquals(21250, expected);
    }

    @Test
    public void test70PercentAndAbove() {
        int expected = BackToSender.calculateWage(80);
        assertEquals(45000, expected);
    }
}
