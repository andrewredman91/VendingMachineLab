import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer {

    private ArrayList<Coin> wallet;
    private ArrayList<Product> pocket;

    public Customer(ArrayList<Coin> wallet, ArrayList<Product> pocket) {
        this.wallet = wallet;
        this.pocket = pocket;
    }

    public ArrayList<Coin> getWallet() {
        return wallet;
    }

    public ArrayList<Product> getPocket() {
        return pocket;
    }

    public void addToPocket(Product product) {
        this.pocket.add(product);
    }

    public void addToWallet(Coin coin) {
        this.wallet.add(coin);
    }

    public void removeFromWallet(Coin coin) {
        this.wallet.remove(coin);
    }
}
