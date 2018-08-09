import Enemies.Troll;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

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
}
