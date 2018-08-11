package Spells;

import Enemies.Enemy;
import Interfaces.ICauseDamage;
import Players.Player;

public abstract class Spell implements ICauseDamage {

    protected int damage;

    public Spell(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void causeDamageToEnemy(Enemy enemy){
        int newHealth = enemy.getHealth() - this.damage;
        enemy.setHealth(newHealth);
    }

    @Override
    public void causeDamageToPlayer(Player player){
        int newHealth = player.getHealth() - this.damage;
        player.setHealth(newHealth);
    }
}
