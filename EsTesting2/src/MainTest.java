import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

class MainTest {
    private final Main testing = new Main();


    @Test
    void ris1() {
        OffsetDateTime offsetData = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        ZonedDateTime data = offsetData.atZoneSimilarLocal(ZoneId.of("Europe/Rome"));
        String result = testing.ris1(data);
        assertEquals("Friday, 1 March 2002, 13:00:00 Central European Standard Time", result);
    }

    @Test
    void ris2() {
        OffsetDateTime offsetData = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        ZonedDateTime data = offsetData.atZoneSimilarLocal(ZoneId.of("Europe/Rome"));
        String result = testing.ris2(data);
        assertEquals("1 Mar 2002, 13:00:00", result);
    }

    @Test
    void ris3() {
        OffsetDateTime offsetData = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        ZonedDateTime data = offsetData.atZoneSimilarLocal(ZoneId.of("Europe/Rome"));
        String result = testing.ris3(data);
        assertEquals("01/03/2002, 13:00", result);
    }
}