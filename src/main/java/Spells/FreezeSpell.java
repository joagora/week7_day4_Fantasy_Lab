package Spells;

import Enemies.Enemy;
import Interfaces.ISpell;

public class FreezeSpell implements ISpell {

    private int damage;

    public FreezeSpell() {
        this.damage = 30;
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
