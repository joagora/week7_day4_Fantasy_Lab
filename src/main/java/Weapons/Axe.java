package Weapons;

import Enemies.Enemy;
import Interfaces.IWeapon;

public class Axe implements IWeapon {

    private int damage;
    private String name;

    public Axe() {
        this.damage = 20;
        this.name = "Axel";
    }

    public void attack(Enemy enemy){
        int newHealth = enemy.getHealth() - this.damage;
        enemy.setHealth(newHealth);
    }

    public String getName() {
        return name;
    }
}
