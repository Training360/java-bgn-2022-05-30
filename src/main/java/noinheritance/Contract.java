package noinheritance;

import java.util.Optional;

public class Contract {

    private String title;

    private Optional<Attachment> attachment;

    public String getInfo() {
        // Delegálás
        return "title" +
                (attachment.isPresent() ?  " " + attachment.get().getInfo() : "");
    }
}
