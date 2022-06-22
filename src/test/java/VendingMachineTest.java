import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    VendingMachine vendingMachine;
    Coin coin1;
    Coin coin2;
    Coin coin3;
    Product product1;
    Product product2;
    Product product3;
    ArrayList<Coin> till;
    ArrayList<Product> products;
    ArrayList<Coin> currentCredit;
    ArrayList<Coin> returnSlot;
    Validator validator;

    @Before
    public void before () {
        coin1 = new Coin("1 Pound", 100, 100, 100);
        coin2 = new Coin("50 Pence", 50, 50, 50);
        coin3 = new Coin("20 Pence", 20, 20, 20);
        product1 = new Product(70, "Sweet");
        product2 = new Product(100, "Cola");
        product3 = new Product(50, "Crisps");
        currentCredit = new ArrayList<>();
        returnSlot = new ArrayList<>();
        validator = new Validator();
        till = new ArrayList<>();
        vendingMachine = new VendingMachine(till, products,currentCredit, returnSlot, validator);

        till.add(coin1);
        till.add(coin1);
        till.add(coin2);
        till.add(coin2);
        till.add(coin3);
        till.add(coin3);
        products = new ArrayList<>();
        products.add(product1);
        products.add(product1);
        products.add(product2);
        products.add(product2);
        products.add(product3);
        products.add(product3);

    }

     @Test
        public void hasCoinsInTill(){
            assertEquals(6, vendingMachine.getTill().size());
        }

    @Test
    public void tillHasTotal(){
        assertEquals(340, vendingMachine.getTillTotal(till));
    }
}
