package meetingroom;

import java.time.LocalDateTime;

public class MeetingRoom {

    private String name;

    private Dimension dimension;

    public MeetingRoom(String name, int length, int width) {
        this.name = name;
        this.dimension = new Dimension(length, width);
    }

    public int getArea() {
        // delegálás
        return dimension.getArea();
    }

    public String getName() {
        return name;
    }

    public void rebuild(int length, int width) {
        dimension = new Dimension(length, width);
    }

    public void elongate(int difference) {
        dimension = dimension.elongate(difference);
    }
}
