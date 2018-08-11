package Runner;

import Enums.ExitType;
import Rooms.MistyForrestRoom;
import Rooms.Room;

public class Runner {

    public static void main(String[] args) {

        Room room = new MistyForrestRoom();
        room.createExits();

    }




}
