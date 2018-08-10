package Weapons;

import Enemies.Enemy;

public abstract class Weapon {

    protected int damage;
    protected String name;

    public Weapon(int damage, String name) {
        this.damage = damage;
        this.name = name;
    }

    public void causeDamage(Enemy enemy){
        int newHealth = enemy.getHealth() - this.damage;
        enemy.setHealth(newHealth);
    }

    public String getName() {
        return name;
    }
}
