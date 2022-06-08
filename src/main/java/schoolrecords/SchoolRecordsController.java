package schoolrecords;

import java.util.*;

public class SchoolRecordsController {

    private static final int EXIT_MENU = 11;
    Scanner scanner;
    private School school;
    private ClassRecords classRecords;

    public SchoolRecordsController(Scanner scanner, School school, ClassRecords classRecords) {
        this.scanner = scanner;
        this.school = school;
        this.classRecords = classRecords;
    }

//    public void initSchool() {
//        Subject math = new Subject("math");
//        Subject physics = new Subject("physics");
//        Subject biology = new Subject("biology");
//        Subject literature = new Subject("literature");
//        subjects = new ArrayList<>(Arrays.asList(math, physics, biology, literature));
//
//        tutors = new ArrayList<>(Arrays.asList(
//                new Tutor("John Doe", new ArrayList<>(Arrays.asList(math, physics))),
//                new Tutor("Jane Smith", new ArrayList<>(Arrays.asList(biology, literature))),
//                new Tutor("Chris Murray", new ArrayList<>(Arrays.asList(biology, math)))
//        ));
//    }

    public void runMenu() {
        int menuNumber = 0;
        while (menuNumber != EXIT_MENU) {
            menuToConsole();
            menuNumber = selectMenu();
            executeMenu(menuNumber);
        }
    }

    private int selectMenu() {
        while (true) {
            System.out.println("Kérem adja meg a menüpont számát:");
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException nfe) {
                System.out.println("Nyomatékosan kérem egy egész számot adjon meg!");
            }
        }
    }

    private void menuToConsole() {
        String menu = """
                1. Diákok nevének listázása
                2. Diák név alapján keresése
                3. Diák létrehozása
                4. Diák név alapján törlése
                5. Diák feleltetése
                6. Osztályátlag kiszámolása
                7. Tantárgyi átlag kiszámolása
                8. Diákok átlagának megjelenítése
                9. Diák átlagának kiírása
                10. Diák tantárgyhoz tartozó átlagának kiírása
                11. Kilépés""";
        System.out.println(menu);
    }

    private String readDataFromConsole(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

    private void averageOfOneStudent() {
        String name = readDataFromConsole("Add meg a tanuló nevét!");
        System.out.println(classRecords.calculateAverage(name));
    }

    private void getAverageOfStudentBySubject() {
        String name = readDataFromConsole("Add meg a tanuló nevét!");
        Subject subject = school.findSubjectByName(readDataFromConsole("Add meg a tantárgy nevét!"));
        System.out.println(classRecords.calculateSubjectAverage(name, subject));
    }

    private void studentRepetition() {
        String name = classRecords.repetition();
        int markValue = Integer.parseInt(readDataFromConsole("Kérem a jegyet!"));
        String subjectName = readDataFromConsole("Kérem a tárgy nevét!");
        Subject subject = school.findSubjectByName(subjectName);
        String tutorName = readDataFromConsole("Kérem a tanár nevét!");
        Tutor tutor = school.findTutorByName(tutorName);
        MarkType markType = MarkType.findByValue(markValue);
        classRecords.grade(name, markType, subject, tutor);
    }

    private void executeMenu(int menuNumber) {
        switch (menuNumber) {
            case 1 -> System.out.println(classRecords.listStudentNames());
            case 2 -> System.out.println(classRecords.findStudentByName(readDataFromConsole("Add meg a tanuló nevét!")));
            case 3 -> classRecords.addStudent(readDataFromConsole("Add meg a tanuló nevét!"));
            case 4 -> classRecords.removeStudent(readDataFromConsole("Add meg a tanuló nevét!"));
            case 5 -> studentRepetition();
            case 6 -> classRecords.calculateClassAverage();
            case 7 -> System.out.println(classRecords.calculateClassAverageBySubject(new Subject(readDataFromConsole("Add meg a tantárgy nevét!"))));
            case 8 -> System.out.println(classRecords.listStudyResults());
            case 9 -> averageOfOneStudent();
            case 10 -> getAverageOfStudentBySubject();
            case 11 -> System.out.println("Kilépés");
            default -> System.out.println("Nem létezik ilyen menüpont!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        School school = new School();
        ClassRecords classRecords = new ClassRecords("4b", new Random());
        SchoolRecordsController schoolRecordsController = new SchoolRecordsController(scanner, school, classRecords);
        schoolRecordsController.runMenu();
    }
}
