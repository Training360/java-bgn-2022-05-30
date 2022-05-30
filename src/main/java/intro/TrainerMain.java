package intro;

public class TrainerMain {

    public static void main(String[] args) {
        /*

            Többsoros megjegyzés.

         */

        String reset = "\u001B[0m";
        String red = "\u001B[31m";
        String green = "\u001B[32m";

        Trainer john = new Trainer("John Doe", 1980);

        System.out.println(red);
        System.out.println(john.getName());
        System.out.println(john.getNameAndYearOfBirth());

        Trainer jack = new Trainer("Jack Doe", 1990); // ILYET NE! Létrehoz egy új oktatót
        System.out.printf("%s%s year of birth: %d", green, jack.getName(), jack.getYearOfBirth());
        System.out.println(reset);

        Trainer anonym = new Trainer("Anonymous", 1900);
        System.out.println(anonym.getNameAndYearOfBirth()); // Konzolra írás

        String poem = """
                Nem tudhatom,
                másnak e tájék
                mit jelent.
                Nekem szülőhazám
                """;

        String poem2 = "Nem tudhatom\n" +
            "másnak e tájék\n" +
                "";

    }
}
