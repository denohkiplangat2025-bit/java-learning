import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        // How to work with DATES & TIMES using Java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        LocalDate date = LocalDate.now();
        //System.out.println(date);

        LocalTime time = LocalTime.now();
        //System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        //System.out.println(dateTime);

        Instant instant = Instant.now();
        //System.out.println(instant);

        // Custom format
        LocalDateTime dateTime2 = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        //System.out.println(newDateTime);

        LocalDate date1 = LocalDate.of(2025, 12, 25);
        //System.out.println(date1);

        LocalDateTime dateTime1 = LocalDateTime.of(2025,12,25,0,0);
        //System.out.println(dateTime1);

        LocalDateTime date2 = LocalDateTime.of(2025,12,25,0,0);
        LocalDateTime date3 = LocalDateTime.of(2026,1,1,0,0);

        if(date2.isBefore(date3)){
            System.out.println(date2 + " is earlier than  " + date3);
        }
        else if(date2.isAfter(date3)){
            System.out.println(date2 + " is earlier than  " + date3);
        }
        else if (date2.equals(date3)){
            System.out.println(date2 + " is equal to  " + date3);
        }
    }
}
