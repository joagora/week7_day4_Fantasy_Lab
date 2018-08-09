package Weapons;

import Enemies.Enemy;
import Interfaces.IWeapon;

public class Axe implements IWeapon {

    private int damage;

    public Axe() {
        this.damage = 20;
    }

    public void attack(Enemy enemy){
        int newHealth = enemy.getHealth() - this.damage;
        enemy.setHealth(newHealth);
    }
}
