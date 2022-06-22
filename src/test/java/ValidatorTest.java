import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidatorTest {

    Validator validator;
    Coin coin1;
    Coin coin2;
    Coin coin3;
    Coin coin4;
    Coin coin5;

    @Before
    public void before() {
        coin1 = new Coin("1 Pound", 100, 100, 100);
        coin2 = new Coin("50 Pence", 50, 50, 50);
        coin3 = new Coin("20 Pence", 20, 20, 20);
        coin4 = new Coin("5 Pence", 5, 5, 5);
        coin5 = new Coin("5 Pence", 5, 69, 5);
        validator = new Validator();
    }
    @Test
    public void canMeasureDimensions(){
        assertEquals(100, validator.measureDimension(coin1));
    }

    @Test
    public void canMeasureAlloySpec(){
        assertEquals(100, validator.measureAlloySpec(coin1));
    }

    @Test
    public void canAcceptCoinValidAlloy(){
        assertEquals(true, validator.validateAlloySpec(coin1));
    }

    @Test
    public void canRejectCoinInvalidAlloy(){
        assertEquals(false, validator.validateAlloySpec(coin4));
    }

    @Test
    public void canAcceptCoinValidDimension(){
        assertEquals(true, validator.validateDimension(coin1));
    }

    @Test
    public void canRejectCoinInvalidDimension(){
        assertEquals(false, validator.validateDimension(coin4));
    }

    @Test
    public void canAcceptValidAlloyAndDimension(){
        assertEquals(true, validator.validateCoin(coin1));
    }

    @Test
    public void canRejectInvalidAlloyOrDimension(){
        assertEquals(false, validator.validateCoin(coin5));
    }

}

