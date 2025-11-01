import java.time.*;

public class Main{
    public static void main(String[] args){
        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        OffsetDateTime ora = OffsetDateTime.now();

        boolean isData1 = data1.isBefore(data2);
        boolean isData2 = data2.isAfter(data1);
        boolean isData3 = data1.equals(ora);
        boolean isData4 = data2.equals(ora);

        System.out.println("Prima data precedente alla seconda? : " + isData1);
        System.out.println("Seconda data successiva alla prima?: " + isData2);
        System.out.println("Prima data uguale a quella attuale?: " + isData3);
        System.out.println("Seconda data uguale a quella attuale?: " + isData4);
    }
}
