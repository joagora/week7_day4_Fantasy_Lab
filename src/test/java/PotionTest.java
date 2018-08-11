import Enemies.Troll;
import Players.Mages.Warlock;
import Potions.Potion;
import Weapons.Club;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PotionTest {

    Warlock warlock;
    Potion potion;
    Club club;

    @Before
    public void before() {
        warlock = new Warlock();
        potion = new Potion();
        club = new Club();
    }

    @Test
    public void hasHealthRestoration() {
        assertEquals(20, potion.getHealthRestoration());
    }

    @Test
    public void canRestoreHealthMoreThanHealthRestorationValue() {
        club.causeDamageToPlayer(warlock);
        assertEquals(90, warlock.getHealth());
        potion.restoreHealth(warlock);
        assertEquals(100, warlock.getHealth());
    }

    @Test
    public void canRestoreHealthLessThanHealthRestorationValue() {
        club.causeDamageToPlayer(warlock);
        club.causeDamageToPlayer(warlock);
        club.causeDamageToPlayer(warlock);
        assertEquals(70, warlock.getHealth());
        potion.restoreHealth(warlock);
        assertEquals(90, warlock.getHealth());
    }
}
