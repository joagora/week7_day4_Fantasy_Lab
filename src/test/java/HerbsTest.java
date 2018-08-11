import Players.Fighters.Dwarf;
import Potions.Herbs;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HerbsTest {

    Dwarf player;
    Herbs herbs;
    @Before
    public void before() {
        player = new Dwarf();
        herbs = new Herbs();
    }

    @Test
    public void hasHealthRestoring() {
        assertEquals(20, herbs.getHealthRestoration());
    }


}
