package inter;

public interface CanCalculatePrice {

    int calculatePrice();

    default int getBasePrice() {
        return 0;
    }
}
