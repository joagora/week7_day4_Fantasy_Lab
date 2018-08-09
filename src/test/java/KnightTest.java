import Players.Fighters.Knight;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight Knight;
    Sword sword;
    @Before
    public void before(){
        sword = new Sword();
        Knight = new Knight();
    }

    @Test
    public void hasWeapon(){
        Sword weapon = (Sword) Knight.getWeapon();
        assertEquals("Exkababer", weapon.getName());
    }
}
