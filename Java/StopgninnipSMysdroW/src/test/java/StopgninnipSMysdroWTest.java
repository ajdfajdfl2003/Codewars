import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class StopgninnipSMysdroWTest {
    @Test
    public void testWelcome() {
        assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
    }

    @Test
    public void testHey_wollef_sroirraw() {
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
    }
}
