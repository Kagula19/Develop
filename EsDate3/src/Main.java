import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main{
    public static void main(String[] args){
        OffsetDateTime offsetData = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String anno = offsetData.format(DateTimeFormatter.ofPattern("yyyy"));
        String mese = offsetData.format(DateTimeFormatter.ofPattern("MM"));
        String giorno = offsetData.format(DateTimeFormatter.ofPattern("dd"));
        String giornoSettimana = offsetData.format(DateTimeFormatter.ofPattern("EEEE"));
        System.out.println("anno " + anno);
        System.out.println("mese " + mese);
        System.out.println("giorno " + giorno);
        System.out.println("giornoSettimana " + giornoSettimana);

    }
}
