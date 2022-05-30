package intro;

public class Trainer {

    private String name;

    private int yearOfBirth;

    /**
     * ILYET SE!
     *
     * Létrehoz egy új Trainer példányt.
     *
     * @param name name
     * @param yearOfBirth year of birth
     */
    public Trainer(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getNameAndYearOfBirth() {
        // return name + ": " + yearOfBirth;
        return String.format("%s: %d", name, yearOfBirth);
    }

    public int getAge(int year) {
        return year - yearOfBirth;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
