package inheritance;

public class RectangleMain {

    public static void main(String[] args) {
        // Liskov substitution principle
        // SOLID
        Square s = new Square(10);
        s.setA(5);
        System.out.println(s.getB());
    }
}
