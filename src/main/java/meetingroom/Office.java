package meetingroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Office {

    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(String name, int length, int width) {
        meetingRooms.add(new MeetingRoom(name, length, width));
    }

    public Optional<MeetingRoom> findByName(String name) {
        for (var meetingRoom: meetingRooms) {
            if (meetingRoom.getName().equals(name)) {
                return Optional.of(meetingRoom);
            }
        }
        return Optional.empty();
    }

    public List<MeetingRoom> findByNamePart(String part) {
//        var result = new ArrayList<MeetingRoom>();
//        for (var meetingRoom: meetingRooms) {
//            if (meetingRoom.getName().contains(part)) {
//                result.add(meetingRoom);
//            }
//        }
//        return result;

        return meetingRooms.stream()
                .filter(r -> r.getName().contains(part))
                .toList();

    }

    public List<String> getNames() {
        var result = new ArrayList<String>();
        for (var meetingRoom: meetingRooms) {
            result.add(meetingRoom.getName());
        }
        return result;
    }
}
