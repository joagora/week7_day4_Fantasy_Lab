package Rooms;

import Enemies.Enemy;
import Enemies.Orc;
import Enemies.Troll;
import Enums.ExitType;
import Game.Dice;

import java.util.ArrayList;
import java.util.Random;

public abstract class Room {
    private ArrayList<ExitType> exits;
    private ExitType direction;
    private String name;
    private ArrayList<Enemy> enemies;

    public Room(ExitType direction, String name) {
        this.name = name;
        this.exits = exits;
        this.direction = direction;
        this.enemies = new ArrayList<>();
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


    public void fillWithRandomEnemy(){
        Dice dice = new Dice();
        int numberOfEnemies = dice.getRandomNumber(2);

        int x = 0;

        while (x <= numberOfEnemies) {
            ArrayList<Enemy> enemyList = new ArrayList<>();
            enemyList.add(new Troll());
            enemyList.add(new Orc());
            int randomIndex = dice.getRandomNumber(1);
            this.enemies.add(enemyList.get(randomIndex));
            x += 1;
        }
        System.out.println(this.enemies);
    }
}
