import Players.Fighters.Dwarf;
import Weapons.MorningStar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MorningStarTest {

    Dwarf dwarf;
    MorningStar morningStar;
    @Before
    public void before() {
        dwarf = new Dwarf();
        morningStar = new MorningStar();
    }

    @Test
    public void canCauseDamage() {
        morningStar.causeDamageToPlayer(dwarf);
        assertEquals(70, dwarf.getHealth());
    }
}

