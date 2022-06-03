package advancedoo;

public class Sheltie extends Dog {

    @Override
    public String getName() {
        return "sheltie";
    }

    public static void main(String[] args) {
        Dog dog = new Sheltie();

        // dinamikus kötés - sheltie-t ír ki, mert
        // az a dinamikus típusa
        // változhat a változó dinamikus típusa
        System.out.println(dog.getName());
    }
}
