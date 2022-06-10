package dates;

public class TimeWatch {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException ie) {
            System.out.println("Interrupted");
        }

        long stop = System.currentTimeMillis();
        System.out.println(stop - start);
    }
}
