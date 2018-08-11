import Enemies.Troll;
import Spells.FreezeSpell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FreezeSpellTest {

    FreezeSpell freezeSpell;
    Troll troll;



    @Before
    public void before() {
        freezeSpell = new FreezeSpell();
        troll = new Troll();
    }

    @Test
    public void hasDamage() {
        assertEquals(30, freezeSpell.getDamage());
    }

    @Test
    public void canCauseDamage() {
        freezeSpell.causeDamageToEnemy(troll);
        assertEquals(70, troll.getHealth());
    }
}
