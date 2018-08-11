package Weapons;

import Enemies.Enemy;
import Interfaces.ICauseDamage;

public abstract class Weapon implements ICauseDamage {

    protected int damage;
    protected String name;

    public Weapon(int damage, String name) {
        this.damage = damage;
        this.name = name;
    }

    @Override
    public void causeDamage(Enemy enemy){
        int newHealth = enemy.getHealth() - this.damage;
        enemy.setHealth(newHealth);
    }

    public String getName() {
        return name;
    }
}
