import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinTest {

    Coin coin;

    @Before
    public void before(){
        coin = new Coin("50p", 50, 50, 50);
    }

    @Test
    public void coinHasValue(){
        assertEquals(50, coin.getValue());
    }

    @Test
    public void coinHasType(){
        assertEquals("50p", coin.getType());
    }

    @Test
    public void coinHasDimensions(){
        assertEquals(50, coin.getDimensions());
    }

    @Test
    public void coinHasAlloySpec(){
        assertEquals(50, coin.getAlloySpec());
    }


}
