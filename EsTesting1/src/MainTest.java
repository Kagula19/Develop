import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MainTest {

    private final Main testing = new Main();


    @Test
    void es1() {
        Integer result = testing.Es1(2,5);
        assertEquals(7,result);
    }
}