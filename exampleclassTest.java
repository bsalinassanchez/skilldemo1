import static org.junit.Assert.*;
import org.junit.*;

public class exampleclassTest {
    @Test 
    public void firstLetterTest() {
        assertEquals("checks that first letter is returned",
            "B", exampleclass.firstLetter("Brandon"));
    }
}