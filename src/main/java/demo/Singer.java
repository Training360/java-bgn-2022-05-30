package demo;

public interface Singer {

    default String sing() {
        System.out.println("Singer.sing");
        return "";
    }
}
