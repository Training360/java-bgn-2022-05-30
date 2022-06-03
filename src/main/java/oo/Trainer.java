package oo;

public class Trainer {

    public Trainer(String name) {
        System.out.println(name);
    }

    public Trainer(String name, int year) {
        System.out.println(name + " " + year);
    }

    // Szignatúrának különböznie kell!
//    public Trainer(String kutya, int macska) {
//
//    }

    public static void main(String[] args) {
        // Nem fordul le: Trainer trainer = new Trainer();
        var trainer = new Trainer("John Doe");

        var another = new Trainer("John Doe", 1900);
    }
}
