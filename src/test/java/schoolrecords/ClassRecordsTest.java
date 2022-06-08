package schoolrecords;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ClassRecordsTest {

    ClassRecords classRecords;

    Tutor tutor;

    @BeforeEach
    void setUp() {
        tutor = new Tutor("Nagy Csilla",
                Arrays.asList(new Subject("földrajz"),
                        new Subject("matematika"),
                        new Subject("biológia"),
                        new Subject("zene"),
                        new Subject("fizika"),
                        new Subject("kémia")));
        classRecords = new ClassRecords("Fourth Grade A", new Random(5));

        classRecords.addStudent("Kovács Rita");
        classRecords.addStudent("Nagy Béla");
        classRecords.addStudent("Varga Márton");


        classRecords.grade("Kovács Rita", MarkType.A, new Subject("földrajz"), tutor);
        classRecords.grade("Kovács Rita", MarkType.C, new Subject("matematika"), tutor);
        classRecords.grade("Kovács Rita", MarkType.D, new Subject("földrajz"), tutor);
        classRecords.grade("Nagy Béla", MarkType.A, new Subject("biológia"), tutor);
        classRecords.grade("Nagy Béla", MarkType.C, new Subject("matematika"), tutor);
        classRecords.grade("Nagy Béla", MarkType.D, new Subject("zene"), tutor);
        classRecords.grade("Varga Márton", MarkType.A, new Subject("fizika"), tutor);
        classRecords.grade("Varga Márton", MarkType.C, new Subject("kémia"), tutor);
        classRecords.grade("Varga Márton", MarkType.D, new Subject("földrajz"), tutor);
    }

    @Test
    void testCreate() {
        assertEquals("Fourth Grade A", classRecords.getClassName());
    }

    @Test
    void testAddStudentAlreadyExists() {
        assertFalse(classRecords.addStudent("Nagy Béla"));
    }

    @Test
    void testAddStudent() {
        assertTrue(classRecords.addStudent("Nagy Klára"));
    }

    @Test
    void testRemoveStudent() {
        assertTrue(classRecords.removeStudent("Nagy Béla"));
    }

    @Test
    void testRemoveStudentDoesNotExists() {
        assertFalse(classRecords.removeStudent("Nagy Klára"));
    }

    @Test
    void testEmptyStudentListShouldThrowException() {
        Exception ex = assertThrows(ArithmeticException.class, () -> new ClassRecords("First Grade", new Random()).calculateClassAverage());
        assertEquals("No student in the class, average calculation aborted!", ex.getMessage());

    }

    @Test
    void testNoMarksShouldThrowException() {
        ClassRecords classRecords = new ClassRecords("First Grade", new Random());
        classRecords.addStudent("Nagy Béla");

        Exception ex = assertThrows(ArithmeticException.class, () -> classRecords.calculateClassAverage());
        assertEquals("No marks present, average calculation aborted!", ex.getMessage());
    }

    @Test
    void testCalculateClassAverage() {
        assertEquals(3.33, classRecords.calculateClassAverage());
    }

    @Test
    void testCalculateClassAverageBySubject() {
        //Given
        Subject geography = new Subject("földrajz");
        //Then
        assertEquals(2.75, classRecords.calculateClassAverageBySubject(geography));
    }

    @Test
    void testEmptyStudentNameShouldThrowException() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> classRecords.findStudentByName(""));
        assertEquals("Student name must not be empty!", ex.getMessage());
    }

    @Test
    void testEmptyListShouldThrowException() {
        Exception ex = assertThrows(IllegalStateException.class, () -> new ClassRecords("First Grade", new Random()).findStudentByName("Kovács Rita"));
        assertEquals("No students to search!", ex.getMessage());
    }

    @Test
    void testNonExistingStudentShouldThrowException() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> classRecords.findStudentByName("Kiss Rita"));
        assertEquals("Student by this name cannot be found! Kiss Rita", ex.getMessage());
    }

    @Test
    void testFindStudentByName() {
        assertEquals("Kovács Rita", classRecords.findStudentByName("Kovács Rita"));
    }

    @Test
    void testEmptyListException() {
        Exception ex = assertThrows(IllegalStateException.class, () -> new ClassRecords("Fourth Grade", new Random()).repetition());
        assertEquals("No students to select for repetition!", ex.getMessage());
    }

    @Test
    void testRepetition() {
        assertEquals("Varga Márton", classRecords.repetition());
    }

    @Test
    void testListStudyResults() {
        //Given
        List<StudyResultByName> list = classRecords.listStudyResults();
        //Then
        assertEquals("Kovács Rita", list.get(0).getStudentName());
        assertEquals(3.33, list.get(0).getStudyAverage());
        assertEquals(3, list.size());
    }

    @Test
    void testListStudentNames() {
        assertEquals(List.of("Kovács Rita", "Nagy Béla", "Varga Márton"), classRecords.listStudentNames());
    }
}
