package i18n;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Messages {

    public static void main(String[] args) {
        ResourceBundle bundle =
                ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle.getString("openscreen.welcome.message"));

        System.out.println(
                MessageFormat.format(bundle.getString("openscreen.p"), "John Doe", 100_000)
        );
    }
}
