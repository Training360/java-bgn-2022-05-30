package inheritance;

public class B extends A {

    @Override
    public String getName() {
        return "b";
    }

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.getName());
    }
}
