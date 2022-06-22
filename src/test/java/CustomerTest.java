import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Coin coin1;
    Coin coin2;
    Coin coin3;
    Product product1;
    Product product2;
    Product product3;
    ArrayList<Coin>wallet;
    ArrayList<Product>pocket;

    @Before
    public void before (){
        coin1 = new Coin("1 Pound", 100, 100, 100);
        coin2 = new Coin("50 Pence", 50, 50, 50);
        coin3 = new Coin("20 Pence", 20, 20, 20);
        wallet = new ArrayList<>();
        pocket = new ArrayList<>();
        wallet.add(coin1);
        wallet.add(coin2);
        wallet.add(coin3);
        product1= new Product(70, "Sweet");
        product2= new Product(100, "Cola");
        product3 = new Product(50, "Crisps");
        customer = new Customer(wallet, pocket);

    }

    @Test
    public void customerHasCoinsInWallet() {
        assertEquals(3, customer.getWallet().size());
    }

    @Test
    public void customerHasEmptyPocket(){
        assertEquals(0, customer.getPocket().size());
    }

    @Test
    public void customerHasAProductInPocket(){
        customer.addToPocket(product1);
        assertEquals(1, customer.getPocket().size());
    }

    @Test
    public void canAddToWallet(){
        customer.addToWallet(coin1);
        assertEquals(4, customer.getWallet().size());
    }

    @Test
    public void canRemoveFromWallet(){
        customer.removeFromWallet(coin1);
        assertEquals(2, customer.getWallet().size());
    }

}
