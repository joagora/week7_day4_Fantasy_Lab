import Players.Fighters.Knight;
import Weapons.Axe;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Sword sword;
    @Before
    public void before(){
        sword = new Sword();
        knight = new Knight();
    }

    @Test
    public void hasWeapon(){
        Sword weapon = (Sword) knight.getWeapon();
        assertEquals("Exkababer", weapon.getName());
    }

    @Test
    public void canChangeWeaponToAxe() {
        knight.changeWeapon();
        Axe axe = (Axe) knight.getWeapon();
        assertEquals("Axel", axe.getName() );
    }
}
