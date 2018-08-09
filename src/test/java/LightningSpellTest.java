import Enemies.Troll;
import Spells.LightningSpell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LightningSpellTest {
    LightningSpell lightningSpell;
    Troll troll;

    @Before
    public void before() {
        lightningSpell = new LightningSpell();
        troll = new Troll();
    }

    @Test
    public void hasDamage() {
        assertEquals(40, lightningSpell.getDamage());
    }

    @Test
    public void canCauseDamage() {
        lightningSpell.causeDamage(troll);
        assertEquals(60, troll.getHealth());
    }
}
