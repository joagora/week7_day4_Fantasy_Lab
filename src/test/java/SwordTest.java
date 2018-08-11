import Enemies.Troll;
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
        troll = new Troll();
    }

    @Test
    public void canAttack() {
        sword.causeDamageToEnemy(troll);
        assertEquals(85, troll.getHealth());
    }
}
