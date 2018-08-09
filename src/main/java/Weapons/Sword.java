package Weapons;

import Enemies.Enemy;
import Interfaces.IWeapon;

public class Sword implements IWeapon {

    private int damage;
    private String name;

    public Sword() {
        this.damage = 15;
        this.name = "Exkababer";
    }


    public void attack(Enemy enemy){
        int newHealth = enemy.getHealth() - this.damage;
        enemy.setHealth(newHealth);
    }

    public String getName() {
        return name;
    }


}

