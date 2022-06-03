package inter;

public class TransactionStateMain {

    public static void main(String[] args) {
        //System.out.println(TransactionState.PENDING.isComplete());

        try {

        }
        catch (IllegalStateException e) {
            System.out.println("alma");
        }
        catch (IllegalArgumentException e) {
            System.out.println("korte");
        }
    }
}
