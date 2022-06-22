public class Coin {

    private String type;
    private int value;
    private int dimensions;
    private int alloySpec;

    public Coin(String type, int value, int dimensions, int alloySpec) {
        this.type = type;
        this.value = value;
        this.dimensions = dimensions;
        this.alloySpec = alloySpec;
    }

    public int getValue() {
        return this.value;
    }

    public String getType() {
        return this.type;
    }

    public int getDimensions() {
        return this.dimensions;
    }

    public int getAlloySpec() {
        return this.alloySpec;
    }

}