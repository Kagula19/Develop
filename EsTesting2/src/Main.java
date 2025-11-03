import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main{
    public static void main(String[] args){
        OffsetDateTime offsetData = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        ZonedDateTime data = offsetData.atZoneSimilarLocal(ZoneId.of("Europe/Rome"));
        System.out.println(ris1(data));
        System.out.println(ris2(data));
        System.out.println(ris3(data));

    }

    public static String ris1(ZonedDateTime x){
        return x.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
    }
    public static String ris2(ZonedDateTime x){
        return x.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
    }
    public static String ris3(ZonedDateTime x){
        return x.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
    }
}
