import java.util.ArrayList;

public class Validator {

    public int measureDimension(Coin coin){
        return coin.getDimensions();
    }

    public int measureAlloySpec(Coin coin) {
        return coin.getAlloySpec();
    }

//    no-one knows what's happening here
    public boolean validateAlloySpec(Coin coin) {
        ArrayList<Integer> validSpecs = new ArrayList<>();
        validSpecs.add(10);
        validSpecs.add(20);
        validSpecs.add(50);
        validSpecs.add(100);
        return validSpecs.contains(coin.getAlloySpec());
        }

    public boolean validateDimension(Coin coin) {
        ArrayList<Integer> validSpecs = new ArrayList<>();
        validSpecs.add(10);
        validSpecs.add(20);
        validSpecs.add(50);
        validSpecs.add(100);
        return validSpecs.contains(coin.getDimensions());
    }

    public boolean validateCoin(Coin coin) {
        return validateDimension(coin) && validateAlloySpec(coin);
    }
}

