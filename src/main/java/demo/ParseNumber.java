package demo;

public class ParseNumber {

    public static void main(String[] args) {
        try {
            int i = Integer.parseInt("123x");
        }
        catch (NumberFormatException e) {
            throw new NotEnoughWaterException("srew", e);
        }
    }

    public void doSomthing()  {
            throw new NotEnoughWaterException("alma", null);
    }
}
