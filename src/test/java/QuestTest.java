import Quests.Quest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestTest {

    Quest quest;

    @Before
    public void before() {
        quest = new Quest();
    }

    @Test
    public void hasRoomList() {
        assertEquals(5, quest.getRoomList().size());
    }
}
