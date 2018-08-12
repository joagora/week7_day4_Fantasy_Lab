import Enums.ExitType;
import Rooms.MistyForrestRoom;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MistyForrestRoomTest {


    MistyForrestRoom mistyForrest;
    @Before
    public void before() {
        mistyForrest = new MistyForrestRoom();
    }

    @Test
    public void hasDirection() {
        assertEquals(ExitType.EAST, mistyForrest.getDirection());
    }


}
