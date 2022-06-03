package meetingroom;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        Optional<String> name = Optional.of("John Doe");

        Optional<String> nobody = Optional.empty();

        if (nobody.isPresent()) {
            System.out.println(name.get());
        }
        else {
            System.out.println("Nincs értéke!");
        }

        //nobody.ifPresent(n -> System.out.println(n));
    }
}
