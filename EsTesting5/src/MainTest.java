import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;


class MainTest {
    private final Main testing = new Main();
    @Test
    void ris1() {
        OffsetDateTime offsetData = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        ZonedDateTime result = testing.ris1(offsetData);
        assertEquals("2024-02-08T13:00+01:00[Europe/Rome]", result.toString());
    }
}