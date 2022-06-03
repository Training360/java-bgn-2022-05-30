package advancedoo;

public class PriceCalculationMain {

    public static void main(String[] args) {
        PriceCalculation priceCalculation = new FirstLetterPriceCalculation("aaa");
        System.out.println(priceCalculation.calculatePrice());

        priceCalculation = new LengthPriceCalculation("xxxx");
        System.out.println(priceCalculation.calculatePrice());
    }
}
