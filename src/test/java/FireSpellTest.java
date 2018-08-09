import Spells.FireSpell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FireSpellTest {

    FireSpell fireSpell;
    @Before
    public void before() {
        fireSpell = new FireSpell();
    }

    @Test
    public void hasDamage() {
        assertEquals(50, fireSpell.getDamage());
    }
}
