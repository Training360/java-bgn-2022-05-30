package demo;

public interface CanSing {

    default String sing() {
        System.out.println("CanSing.sing");
        return "";
    }
}
