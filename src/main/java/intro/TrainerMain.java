package intro;

public class TrainerMain {

    public static void main(String[] args) {
        Trainer john = new Trainer();
        john.name = "John Doe";
        john.yearOfBirth = 1980;

        System.out.println(john.name);
        System.out.println(john.yearOfBirth);

        Trainer jack = new Trainer();
        jack.name = "Jack Doe";
        jack.yearOfBirth = 1990;
        System.out.printf("%s year of birth: %d", jack.name, jack.yearOfBirth);
    }
}
