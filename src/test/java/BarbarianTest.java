import Players.Fighters.Barbarian;
import Weapons.Club;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Club club;

    @Before
    public void before(){
        club = new Club();
        barbarian = new Barbarian();
    }

    @Test
    public void hasWeapon(){
        Club weapon = (Club) barbarian.getWeapon();
        assertEquals("Spikey", weapon.getName());
    }
}
