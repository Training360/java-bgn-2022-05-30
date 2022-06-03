package detailed;

public class Literals {

    public Literals(Long id) {
        System.out.println(id);
    }

    public static void main(String[] args) {
        var i = 12;
        long l = 34;

        new Literals(12L);

//        long l1 = null;
        Long l2 = null;

        char c = 'a';
        System.out.println(c);
        System.out.println((int) c);

        System.out.println('c' > 'a');

        int a = Integer.parseInt("123");
        double b = Double.parseDouble("123.12");

//        String s = "" + 12;
        String s = Integer.toString(12);

        int j = 12;
        byte d = (byte) j;

        float f = 12;

        double d2 = ((double) 1) / 2;
        System.out.println(d2);

        System.out.println(0.1 * 3 == 0.3);

        System.out.println(0.1 * 3);
    }
}
