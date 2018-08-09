import Beasts.Dragon;
import Players.Mages.Wizard;
import Spells.FireSpell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before() {
        wizard = new Wizard();
    }

    @Test
    public void hasDragonAsDefence() {
        Dragon dragon = (Dragon) wizard.getDefence();
        assertEquals("Dinosaur", dragon.getName());
    }

    @Test
    public void hasFireSpellAsSpell() {
        FireSpell spell = (FireSpell) wizard.getSpell();
        assertEquals(50, spell.getDamage());
    }

    @Test
    public void testCauseDamage(){

    }
}
