package Rooms;

import Enums.ExitType;
import Game.Dice;

import java.util.ArrayList;
import java.util.Random;

public abstract class Room {
    private ArrayList<ExitType> exits;
    private ExitType direction;
    private String name;

    public Room(ExitType direction, String name) {
        this.name = name;
        this.exits = exits;
        this.direction = direction;
        createExits();
    }



    public void createExits(){
        ArrayList<ExitType> exitsOfRoom = new ArrayList<>();
        ExitType[] allAvailableExits = ExitType.values();
        Dice dice = new Dice();
        int numberOfExits = dice.getRandomNumber(3) + 1;
        int x = 0;
        while (x < numberOfExits) {
            ExitType randomExit = allAvailableExits[new Random().nextInt(allAvailableExits.length)];
            exitsOfRoom.add(randomExit);
            x += 1;
        }
    }

    public ExitType getDirection(){
        return this.direction;
    }

    public String getName() {
        return name;
    }
}