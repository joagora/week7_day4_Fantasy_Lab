package Quests;
import Enums.ExitType;
import Players.Player;
import Rooms.*;

import java.util.ArrayList;

public class Quest {

    private ArrayList<Room> roomList;
    private ArrayList<Player> questPlayers;

    public Quest() {
        this.roomList = new ArrayList<>();
        this.questPlayers = new ArrayList<>();
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

    public Room getRoomOfDirection(ExitType exit){
        Room foundRoom = null;
        for (Room room: this.roomList) {
            if (room.getDirection() == exit){
                foundRoom = room;
                break;
            }
        }
        return foundRoom;
    }

    public void removeRoomFromListByName(Room roomToRemove){
        this.roomList.remove(roomToRemove);
    }

    public void movePlayerToAnotherRoom(Player player, ExitType exit){

        if (this.roomList.size() > 0) {
            Room newLocation = getRoomOfDirection(exit);
            player.setCurrentLocation(newLocation);
            Room currentRoom = player.getCurrentLocation();
            removeRoomFromListByName(currentRoom);
        } else {
            return;
        }
    }

    public int questPlayersCount(){
        return this.questPlayers.size();
    }

    public void addPlayerToQuest(Player player){
        this.questPlayers.add(player);
        Room firstRoom = this.getRoomList().get(0);
        player.setCurrentLocation(firstRoom);
        removeRoomFromListByName(firstRoom);
    }

    public ArrayList<Player> getQuestPlayers(){
        return this.questPlayers;
    }
}
