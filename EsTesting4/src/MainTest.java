import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;


class MainTest {
    private final Main testing = new Main();

    @Test
    void Ris1() {
        OffsetDateTime offsetData = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String result = testing.ris1(offsetData);
        assertEquals("2023", result);
    }

    @Test
    void ris2() {
        OffsetDateTime offsetData = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String result = testing.ris2(offsetData);
        assertEquals("03", result);
    }

    @Test
    void ris3() {
        OffsetDateTime offsetData = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String result = testing.ris3(offsetData);
        assertEquals("01", result);
    }

    @Test
    void ris4() {
        OffsetDateTime offsetData = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String result = testing.ris4(offsetData);
        assertEquals("Wednesday", result);
    }
}