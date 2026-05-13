import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OshoFreePromoEngineTest{

    @Test
    public void test10PercentDiscount(){
        double cartTotal = 7000;
        String promoCode = "STARTER10";
        double expected = OshoFreePromoEngine.calculateFinalPrice(cartTotal, promoCode);
        double actual = 6300;
        assertEquals(actual, expected);
    }

    @Test
    public void test20PercentDiscount(){
        double cartTotal = 15000;
        String promoCode = "BIGBOY20";
        double expected = OshoFreePromoEngine.calculateFinalPrice(cartTotal, promoCode);
        double actual = 12000;
        assertEquals(actual, expected);
    }

    @Test
    public void test35PercentDiscount(){
        double cartTotal = 30000;
        String promoCode = "OSHOFREE35";
        double expected = OshoFreePromoEngine.calculateFinalPrice(cartTotal, promoCode);
        double actual = 19500;
        assertEquals(actual, expected);
    }

    @Test
    public void testZeroPercentDiscount(){
        double cartTotal = 4000;
        String promoCode = "STARTER10";
        double expected = OshoFreePromoEngine.calculateFinalPrice(cartTotal, promoCode);
        double actual = 4000;
        assertEquals(actual, expected);
    }

    @Test
    public void testDiscountForExactly5000(){
        double cartTotal = 5000;
        String promoCode = "STARTER10";
        double expected = OshoFreePromoEngine.calculateFinalPrice(cartTotal, promoCode);
        double actual = 4500;
        assertEquals(actual, expected);
    }
    @Test
    public void testFakeDiscountCode(){
        double cartTotal = 35000;
        String promoCode = "FAKECODE77";
        double expected = OshoFreePromoEngine.calculateFinalPrice(cartTotal, promoCode);
        double actual = 35000;
        assertEquals(actual, expected);
    }

}
