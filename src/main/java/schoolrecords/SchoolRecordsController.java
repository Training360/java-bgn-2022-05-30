package schoolrecords;

import java.util.*;

public class SchoolRecordsController {

    private static final int EXIT_MENU = 11;
    Scanner scanner = new Scanner(System.in);
    private School school = new School();
    private ClassRecords classRecords = new ClassRecords("9.A", new Random());


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
        System.out.println("1. Diákok nevének listázása\n" +
                "2. Diák név alapján keresése\n" +
                "3. Diák létrehozása\n" +
                "4. Diák név alapján törlése\n" +
                "5. Diák feleltetése\n" +
                "6. Osztályátlag kiszámolása\n" +
                "7. Tantárgyi átlag kiszámolása\n" +
                "8. Diákok átlagának megjelenítése\n" +
                "9. Diák átlagának kiírása\n" +
                "10. Diák tantárgyhoz tartozó átlagának kiírása\n" +
                "11. Kilépés");
    }

    private String readDataFromConsole(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

    private void averageOfOneStudent() {
        Student student = classRecords.findStudentByName(readDataFromConsole("Add meg a tanuló nevét!"));
        System.out.println(student.calculateAverage());
    }

    private void getAverageOfStudentBySubject() {
        Student student = classRecords.findStudentByName(readDataFromConsole("Add meg a tanuló nevét!"));
        Subject subject = school.findSubjectByName(readDataFromConsole("Add meg a tantárgy nevét!"));
        System.out.println(student.calculateSubjectAverage(subject));
    }

    private void studentRepetition() {
        Student student = classRecords.repetition();
        int mark = Integer.parseInt(readDataFromConsole("Kérem a jegyet!"));
        String subjectName = readDataFromConsole("Kérem a tárgy nevét!");
        String tutorName = readDataFromConsole("Kérem a tanár nevét!");

        Mark actualMark = new Mark(MarkType.findByValue(mark), school.findSubjectByName(subjectName), school.findTutorByName(tutorName));
        student.grading(actualMark);
    }

    private void executeMenu(int menuNumber) {
        switch (menuNumber) {
            case 1: {
                System.out.println(classRecords.listStudentNames());
                return;
            }
            case 2: {
                System.out.println(classRecords.findStudentByName(readDataFromConsole("Add meg a tanuló nevét!")));
                return;
            }
            case 3: {
                classRecords.addStudent(new Student(readDataFromConsole("Add meg a tanuló nevét!")));
                return;
            }
            case 4: {
                classRecords.removeStudent(new Student(readDataFromConsole("Add meg a tanuló nevét!")));
                return;
            }
            case 5: {
                studentRepetition();
                return;
            }
            case 6: {
                classRecords.calculateClassAverage();
                return;
            }
            case 7: {
                System.out.println(classRecords.calculateClassAverageBySubject(new Subject(readDataFromConsole("Add meg a tantárgy nevét!"))));
                return;
            }
            case 8: {
                System.out.println(classRecords.listStudyResults());
                return;
            }
            case 9: {
                averageOfOneStudent();
                return;
            }
            case 10: {
                getAverageOfStudentBySubject();
                return;
            }
            case 11: {
                return;
            }
            default: {
                System.out.println("Nem létezik ilyen menüpont!");
            }
        }
    }

    public static void main(String[] args) {
        SchoolRecordsController schoolRecordsController = new SchoolRecordsController();
        schoolRecordsController.runMenu();
    }
}
