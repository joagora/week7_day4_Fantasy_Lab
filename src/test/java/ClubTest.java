import Enemies.Troll;
import Weapons.Club;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ClubTest {
    Club club;
    Troll troll;
    @Before

    public void before() {
        club = new Club();
        troll = new Troll("Derek");
    }

    @Test
    public void canAttack() {
        club.attack(troll);
        assertEquals(90, troll.getHealth());
    }

}
