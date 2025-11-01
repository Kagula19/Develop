import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main{
    public static void main(String[] args){
        OffsetDateTime offsetData = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        ZonedDateTime data = offsetData.atZoneSimilarLocal(ZoneId.of("Europe/Rome"));
        System.out.println("data 1 " + data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)));
        System.out.println("data 2 " + data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
        System.out.println("data 3 " + data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));

    }
}
