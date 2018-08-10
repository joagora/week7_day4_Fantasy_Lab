
import Beasts.Ogre;
import Players.Mages.Warlock;
import Spells.LightningSpell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {


    Warlock warlock;

    @Before
    public void before() {
        warlock = new Warlock();
    }

    @Test
    public void hasDragonAsDefence() {
        Ogre ogre = (Ogre) warlock.getDefence();
        assertEquals("Shmurk", ogre.getName());
    }

    @Test
    public void hasFireSpellAsSpell() {
        LightningSpell spell = (LightningSpell) warlock.getSpell();
        assertEquals(40, spell.getDamage());
    }

    @Test
    public void hasStamina() {
        assertEquals(40, warlock.getStamina());
    }

    @Test
    public void hasStrength() {
        assertEquals(20, warlock.getStrength());
    }
}
