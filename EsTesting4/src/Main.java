import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main{
    public static void main(String[] args){
        OffsetDateTime offsetData = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("anno " + ris1(offsetData));
        System.out.println("mese " + ris2(offsetData));
        System.out.println("giorno " + ris3(offsetData));
        System.out.println("giornoSettimana " + ris4(offsetData));

    }

    public static String ris1(OffsetDateTime x){
        return x.format(DateTimeFormatter.ofPattern("yyyy"));
    }
    public static String ris2(OffsetDateTime x){
        return x.format(DateTimeFormatter.ofPattern("MM"));
    }
    public static String ris3(OffsetDateTime x){
        return x.format(DateTimeFormatter.ofPattern("dd"));
    }
    public static String ris4(OffsetDateTime x){
        return x.format(DateTimeFormatter.ofPattern("EEEE"));
    }
}
