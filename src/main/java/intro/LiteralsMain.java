package intro;

public class LiteralsMain {

    public static void main(String[] args) {
        String name = "John Doe";
        int age = 23;
        int salary = 100_000;

        double vat = 21.14;

        boolean isComplete = true;

        String color = "red";
        System.out.println(color.toUpperCase());

//        String favouriteColor = null;
//        System.out.println(favouriteColor.toUpperCase());

        int i = 10;
        double d = i; // automatikus típuskonverzió van

        double e = 32.6;
        int j = (int) e; // explicit konverzió
            // LEVÁGJA a tizedesjegyeket

        double percent;

        System.out.println("Hello literals, types and variables");

        percent = 8;

        System.out.println(percent);

        int a;
        int b;
        int c;

        a = b = c = 2;


        System.out.println(a = b);
        System.out.println(a == b);

    }
}
