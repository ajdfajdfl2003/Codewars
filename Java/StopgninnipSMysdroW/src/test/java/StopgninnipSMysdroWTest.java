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

    @Test
    public void testThis_is_a_test() {
        assertEquals("This is a test", new SpinWords().spinWords("This is a test"));
    }

    @Test
    public void testThis_is_another_test() {
        assertEquals("This is rehtona test", new SpinWords().spinWords("This is another test"));
    }
}
