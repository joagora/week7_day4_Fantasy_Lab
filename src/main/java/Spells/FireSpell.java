package Spells;

import Enemies.Enemy;
import Interfaces.ISpell;

public class FireSpell implements ISpell {

    private int damage;

    public FireSpell() {
        this.damage = 50;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void causeDamage(Enemy enemy){
        int newHealth = enemy.getHealth() - this.damage;
        enemy.setHealth(newHealth);
    }
}
