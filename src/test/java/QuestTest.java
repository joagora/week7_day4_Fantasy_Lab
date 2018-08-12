import Enums.ExitType;
import Players.Mages.Wizard;
import Players.Player;
import Quests.Quest;
import Rooms.MistyForrestRoom;
import Rooms.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestTest {

    Quest quest;
    Room room;
    Player player;

    @Before
    public void before() {
        quest = new Quest();
        room = new MistyForrestRoom();
        player = new Wizard();
    }

    @Test
    public void hasRoomList() {
        assertEquals(5, quest.getRoomList().size());
    }

    @Test
    public void canGetRoomOfSpecificDirection() {
        assertEquals("Misty Forrest", quest.getRoomOfDirection(ExitType.EAST).getName());
    }


    @Test
    public void canRemoveRoomFromList() {
        quest.removeRoomFromListByName(quest.getRoomOfDirection(ExitType.EAST));
        assertEquals(4, quest.getRoomList().size());
    }

    @Test
    public void canMovePlayerToAnotherRoom() {
        quest.movePlayerToAnotherRoom(player, ExitType.EAST);
        assertEquals(4, quest.getRoomList().size());
        assertEquals("Misty Forrest", player.getCurrentLocation().getName());
    }
}
