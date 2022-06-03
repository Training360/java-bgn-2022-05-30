package inter;

public class LengthPriceCalculator implements CanCalculatePrice {

    private String productName;

    public LengthPriceCalculator(String productName) {
        this.productName = productName;
    }

    @Override
    public int calculatePrice() {
        return productName.length();
    }
}
