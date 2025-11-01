import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main{
    public static void main(String[] args){
        OffsetDateTime offsetData = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        offsetData.plusDays(7);
        offsetData.plusMonths(1);
        offsetData.plusYears(1);

        ZonedDateTime data = offsetData.atZoneSimilarLocal(ZoneId.of("Europe/Rome"));
        System.out.println("data: " + data);

    }
}
