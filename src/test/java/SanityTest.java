
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class SanityTest
{
    Boolean sane;

    @BeforeEach
    public void setup()
    {
        sane = true;
    }

    @Test
    public void simplePassingTest()
    {
        assertTrue(sane);
    }

    @Test
    public void simpleFailingTest()
    {
        assertFalse(sane);
    }
}
