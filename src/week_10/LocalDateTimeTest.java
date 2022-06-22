package week_10;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {
    public static void main(String[] args) {

        //Format examples
        LocalDate date = LocalDate.now();
        System.out.println("\nDefault format of LocalDate="+date);  // 2022-06-22
        System.out.println("specific format : " + date.format(DateTimeFormatter.ofPattern("d-MMM-y")));
                                                                    // 22-Jun-2022
        System.out.println("specific format : " + date.format(DateTimeFormatter.ofPattern("d-MMM-yy")));
                                                                    // 22-Jun-22
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Default format of LocalDateTime="+dateTime);    // 2022-06-20T23:00:04.535844800
        System.out.println("specific format : " + dateTime.format(DateTimeFormatter.ofPattern("d-MMM-y HH:mm:ss")));
        Instant timestamp = Instant.now();                          // 20-Jun-2022 23:00:04
        System.out.println("Default format of Instant="+timestamp); // 2022-06-20T20:00:04.536841900Z

        //Parse examples
        LocalDateTime dt = LocalDateTime.parse("27-Apr-2014 21:39:48",
                DateTimeFormatter.ofPattern("d-MMM-y HH:mm:ss"));
        System.out.println("Default format after parsing = "+dt+"\n");  // 2014-04-27T21:39:48
    }
}
