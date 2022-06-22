import javax.crypto.spec.PSource;
import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Coin> till;
    private ArrayList<Product> products;
    private  ArrayList<Coin> currentCredit;
    private ArrayList<Coin> returnSlot;
    private Validator validator;

    public VendingMachine(ArrayList<Coin> till, ArrayList<Product> products, ArrayList<Coin> currentCredit, ArrayList<Coin> returnSlot, Validator validator) {
        this.till = till;
        this.products = products;
        this.currentCredit = currentCredit;
        this.returnSlot = returnSlot;
        this.validator = validator;
    }

    public ArrayList<Coin> getTill() {
        return this.till;
    }

    public int getTillTotal(ArrayList<Coin> till) {
        ArrayList<Coin> tempTill = new ArrayList<>();
        for()
        return counter;
    }

//    public int getTillTotal() {
//        for(int counter = 0; counter < this.till.size(); counter += this.till.coin.getValue());
//
//    }
}
