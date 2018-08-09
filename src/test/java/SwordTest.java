import Enemies.Troll;
import Weapons.Axe;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SwordTest {

    Sword sword;
    Troll troll;
    @Before

    public void before() {
        sword = new Sword();
        troll = new Troll("Derek");
    }

    @Test
    public void canAttack() {
        sword.attack(troll);
        assertEquals(85, troll.getHealth());
    }
}
