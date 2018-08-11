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
    public void hasStrength() {
        assertEquals(20, orc.getStrength());
    }

    @Test
    public void hasResistanceToMagic() {
        assertEquals(false, orc.getResistanceToMagic());
    }

    @Test
    public void hasClub() {
        assertEquals("Spikey", orc.getWeapon().getName());
    }
}
