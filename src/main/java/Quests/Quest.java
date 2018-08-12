package Quests;
import Rooms.*;

import java.util.ArrayList;

public class Quest {

    private ArrayList<Room> roomList;

    public Quest() {
        this.roomList = new ArrayList<>();
        addRooms();
    }

    public void addRooms(){
        this.roomList.add(new IcyCaveRoom());
        this.roomList.add(new MistyForrestRoom());
        this.roomList.add(new SlipperySlopesRoom());
        this.roomList.add(new SmokyMountainsRoom());
        this.roomList.add(new WildernessRoom());
    }

    public ArrayList<Room> getRoomList() {
        return roomList;
    }
}
