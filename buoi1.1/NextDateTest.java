import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NextDateTest {
    @Test
    public void testNextDate() {
        assertEquals("2/5/2020", NextDate.getNextDate(1, 5, 2020));
        assertEquals("1/6/2020", NextDate.getNextDate(31, 5, 2020));
        assertEquals("1/1/2021", NextDate.getNextDate(31, 12, 2020));
        assertEquals("Invalid date", NextDate.getNextDate(29, 2, 2021));
        assertEquals("29/2/2024", NextDate.getNextDate(28, 2, 2024));
    }
}