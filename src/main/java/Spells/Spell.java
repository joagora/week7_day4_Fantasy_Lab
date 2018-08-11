package Spells;

import Enemies.Enemy;
import Interfaces.ICauseDamage;

public abstract class Spell implements ICauseDamage {

    protected int damage;

    public Spell(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void causeDamage(Enemy enemy){
        int newHealth = enemy.getHealth() - this.damage;
        enemy.setHealth(newHealth);
    }
}
