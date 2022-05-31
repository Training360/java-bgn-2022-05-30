package operators;

public class OperatorsMain {

    public static void main(String[] args) {
        System.out.println(true | new OperatorsMain().getBoolean());
        System.out.println(true || new OperatorsMain().getBoolean());

        int i = 10;
        i++; // i = i + 1
        i += 10; // i = i + 10

        System.out.println(5 > 10 ? 100 : 100_000);
    }

    public boolean getBoolean() {
        System.out.println("getBoolean");
        return false;
    }
}
