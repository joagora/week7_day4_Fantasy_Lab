package Spells;

import Enemies.Enemy;
import Interfaces.ISpell;

public class LightningSpell implements ISpell {

    private int damage;

    public LightningSpell() {
        this.damage = 40;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void causeDamage(Enemy enemy) {
        int newHealth = enemy.getHealth() - this.damage;
        enemy.setHealth(newHealth);
    }
}

