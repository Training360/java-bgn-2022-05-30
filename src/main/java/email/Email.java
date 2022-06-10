package email;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Email {

    private String subject;

    private String to;

    private String body;

    public static void main(String[] args) {
        var email = new Email("subject", "to", "body");
        System.out.println(email);
        System.out.println(email.getBody());

    }
}
