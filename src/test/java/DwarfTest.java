import Players.Fighters.Dwarf;
import Weapons.Axe;
import Weapons.Club;
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
        assertEquals("Axel", weapon.getName());
    }

    @Test
    public void canChangeWeaponToClub() {
        dwarf.changeWeapon();
        Club club = (Club) dwarf.getWeapon();
        assertEquals("Spikey", club.getName() );
    }

}
