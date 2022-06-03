package meetingroom;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OfficeTest {

    private Office office = new Office();

    @BeforeEach
    void init() {
        office.addMeetingRoom("Steve Jobs", 5, 10);
        office.addMeetingRoom("Kolombusz", 6, 11);
        office.addMeetingRoom("Bill Gates", 6, 11);
    }

    @Test
    void getNames() {
        assertEquals(List.of("Steve Jobs", "Kolombusz", "Bill Gates"), office.getNames());
    }

    @Test
    void findByName() {
        var result = office.findByName("Kolombusz");
        assertEquals("Kolombusz", result.get().getName());
    }

    @Test
    void notFound() {
        var result = office.findByName("Rubik Ernő");
        assertTrue(result.isEmpty());
    }

    @Test
    void findByPart() {
        var result = office.findByNamePart("l");
        assertEquals(2, result.size());
        assertEquals("Bill Gates", result.get(1).getName());

        assertEquals(List.of("Kolombusz", "Bill Gates"),
                result.stream().map(MeetingRoom::getName).toList());
    }
}