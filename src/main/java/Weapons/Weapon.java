package Weapons;

import Enemies.Enemy;
import Interfaces.ICauseDamage;

import Players.Player;


public abstract class Weapon implements ICauseDamage {

    protected int damage;
    protected String name;

    public Weapon(int damage, String name) {
        this.damage = damage;
        this.name = name;
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

    public String getName() {
        return name;
    }
}
