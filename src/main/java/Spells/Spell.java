package Spells;

import Enemies.Enemy;

public abstract class Spell {

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
