package advancedoo;

public class FirstLetterPriceCalculation extends PriceCalculation {

    public FirstLetterPriceCalculation(String productName) {
        super(productName);
    }

    @Override
    public int calculatePrice() {
        return getProductName().charAt(0);
    }
}
