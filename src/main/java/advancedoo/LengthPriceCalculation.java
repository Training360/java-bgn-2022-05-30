package advancedoo;

public class LengthPriceCalculation extends PriceCalculation {

    public LengthPriceCalculation(String productName) {
        super(productName);
    }

    @Override
    public int calculatePrice() {
        return getProductName().length();
    }
}
