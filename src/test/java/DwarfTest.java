import Players.Fighters.Dwarf;
import Weapons.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Axe axe;
    @Before
    public void before(){
        axe = new Axe();
        dwarf = new Dwarf();
    }

    @Test
    public void hasWeapon(){
        Axe weapon = (Axe) dwarf.getWeapon();
        assertEquals("Alfred", weapon.getName());
    }
}
