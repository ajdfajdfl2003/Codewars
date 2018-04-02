import com.angus.codewars.Max;
import org.junit.Assert;
import org.junit.Test;

public class MaxSequenceTest {
    @Test
    public void testEmptyArray() throws Exception {
        Assert.assertEquals("Empty arrays should have a max of 0",
                0, Max.sequence(new int[]{}));
    }
}
