package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimeDemo {

    public static void main(String[] args) {
        LocalDateTime t = LocalDateTime.now();
        System.out.println(t);

        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalDateTime t1 = LocalDateTime.of(2022, 1, 1, 10, 2);
        System.out.println(t1);

        LocalDateTime t2 = LocalDateTime.of(2022, 9, 01, 10, 2);
        System.out.println(077); // oktális számrendszerben van
        System.out.println(t1.isAfter(t2));
    }
}
