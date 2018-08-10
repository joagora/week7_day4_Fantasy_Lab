import Enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;

    @Before
    public void before() {
        orc = new Orc();
    }

    @Test
    public void hasName() {
        assertEquals("Trevor", orc.getName());
    }

    @Test
    public void hasStamina() {
        assertEquals(30, orc.getStamina());
    }

    @Test
    public void hasStrenght() {
        assertEquals(20, orc.getStrength());
    }
}
