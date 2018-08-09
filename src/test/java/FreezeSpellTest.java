import Spells.FreezeSpell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FreezeSpellTest {

    FreezeSpell freezeSpell;
    @Before
    public void before() {
        freezeSpell = new FreezeSpell();
    }

    @Test
    public void hasDamage() {
        assertEquals(30, freezeSpell.getDamage());
    }
}
