package Weapons;

import Enemies.Enemy;
import Interfaces.IWeapon;

public class Club implements IWeapon {
    private int damage;
    private String name;

    public Club() {
        this.damage = 10;
        this.name = "Spikey";
    }

    public void attack(Enemy enemy){
        int newHealth = enemy.getHealth() - this.damage;
        enemy.setHealth(newHealth);
    }

    public String getName() {
        return name;
    }
}
