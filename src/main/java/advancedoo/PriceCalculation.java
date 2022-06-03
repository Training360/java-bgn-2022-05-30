package advancedoo;

public abstract class PriceCalculation {

    private String productName;

    public PriceCalculation(String productName) {
        this.productName = productName;
    }

    public abstract int calculatePrice();

    public String getProductName() {
        return productName;
    }
}
