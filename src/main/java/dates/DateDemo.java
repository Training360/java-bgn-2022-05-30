package dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateDemo {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.MEDIUM)
                .withLocale(Locale.CHINA);

        System.out.println(now.format(formatter));
        System.out.println(formatter.format(now));

        System.out.println(now);

        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter myFormatter1 = DateTimeFormatter.ofPattern("yy*M*dd");
        DateTimeFormatter myFormatter2 = DateTimeFormatter.ofPattern("yy*MM*dd");
        DateTimeFormatter myFormatter3 = DateTimeFormatter.ofPattern("yy*MMM*dd");
        DateTimeFormatter myFormatter4 = DateTimeFormatter.ofPattern("yy*MMMM*dd");
        System.out.println(myFormatter1.format(now));
        System.out.println(myFormatter2.format(now));
        System.out.println(myFormatter3.format(now));
        System.out.println(myFormatter4.format(now));
    }
}
