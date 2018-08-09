import Enemies.Troll;
import Players.Mages.Warlock;
import Spells.FireSpell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FireSpellTest {

    FireSpell fireSpell;
    Troll troll;

    @Before
    public void before() {
        fireSpell = new FireSpell();
        troll = new Troll();
    }

    @Test
    public void hasDamage() {
        assertEquals(50, fireSpell.getDamage());
    }

    @Test
    public void canCauseDamage() {
        fireSpell.causeDamage(troll);
        assertEquals(50, troll.getHealth());
    }
}
