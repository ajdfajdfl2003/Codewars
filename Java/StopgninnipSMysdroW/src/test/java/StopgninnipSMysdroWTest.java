import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class StopgninnipSMysdroWTest {
    @Test
    public void testWelcome() {
        assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
    }
}
