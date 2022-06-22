import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    Product product1;
    Product product2;
    Product product3;

    @Before
    public void before(){
        product1= new Product(70, "Sweet");
        product2= new Product(100, "Cola");
        product3 = new Product(50, "Crisps");
    }

    @Test
    public void product1HasName(){
        assertEquals("Sweet", product1.getName());
    }

    @Test
    public void product2HasPrice(){
        assertEquals(100, product2.getPrice());
    }
}
