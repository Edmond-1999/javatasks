import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaWahalaTest{

    @Test
    public void testSapaPizzaSize(){
        int expected = PizzaWahala.pizzaPrice(12, "Sapa");
        assertEquals(7500, expected);
    }

    @Test
    public void testSmallPizzaSize(){
        int expected = PizzaWahala.pizzaPrice(12, "Small");
        assertEquals(5800, expected);

    }

    @Test
    public void testBigPizzaSize(){
        int expected = PizzaWahala.pizzaPrice(12, "Big");
        assertEquals(8000, expected);

    }

    @Test
    public void testOdogwuPizzaSize(){
        int expected = PizzaWahala.pizzaPrice(12, "Odogwu");
        assertEquals(5200, expected);
    }
}
