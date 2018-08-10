import Enemies.Troll;
import Weapons.Axe;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AxeTest {

    Axe axe;
    Troll troll;
    @Before

    public void before() {
        axe = new Axe();
        troll = new Troll();
    }

    @Test
    public void canAttack() {
        axe.causeDamage(troll);
        assertEquals(80, troll.getHealth());
    }
}
