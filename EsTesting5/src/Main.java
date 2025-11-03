import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main{
    public static void main(String[] args){
        OffsetDateTime offsetData = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        System.out.println("data: " + ris1(offsetData));

    }
    public static ZonedDateTime ris1(OffsetDateTime x){
        return x.plusYears(1).minusMonths(1).plusDays(7).atZoneSimilarLocal(ZoneId.of("Europe/Rome"));
    }
}
