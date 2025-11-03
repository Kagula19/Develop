import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

class MainTest {
    private final Main testing = new Main();

    @Test
    void ris1() {
        OffsetDateTime offsetData = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        ZonedDateTime data = offsetData.atZoneSimilarLocal(ZoneId.of("Europe/Rome"));
        String result = testing.ris1(data);
        assertEquals("1 March 2023", result);
    }
}