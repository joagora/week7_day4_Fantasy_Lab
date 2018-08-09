import Enemies.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll;
    @Before
    public void before(){
        troll = new Troll("Trevor");
    }

    @Test
    public void hasHealth() {
        assertEquals(100, troll.getHealth());
    }

    @Test
    public void canSetHealth() {
        troll.setHealth(80);
        assertEquals(80, troll.getHealth());
    }



}