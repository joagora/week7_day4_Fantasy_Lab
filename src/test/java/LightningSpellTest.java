import Spells.LightningSpell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LightningSpellTest {


    LightningSpell lightningSpell;
    @Before
    public void before() {
        lightningSpell = new LightningSpell();
    }

    @Test
    public void hasDamage() {
        assertEquals(40, lightningSpell.getDamage());
    }
}
