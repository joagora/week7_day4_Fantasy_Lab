package Players.Fighters;

import Enemies.Enemy;
import Game.Dice;
import Interfaces.IWeapon;
import Players.Player;
import Weapons.Weapon;

public abstract class Fighter extends Player implements IWeapon {
    private Weapon weapon;


    public Fighter(String name, int stamina, int strength) {
        super(name, stamina, strength);
        this.weapon = null;

    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon newWeapon){
        this.weapon = newWeapon;
    }

    public abstract void changeWeapon();

    public void attack(Enemy enemy){
        Dice dice = new Dice();
        int playerLuck = dice.getRandomNumber();
        int enemyLuck = dice.getRandomNumber();
        if (enemy.getStrength() + enemyLuck > this.getStrength() + playerLuck) {
            this.getWeapon().causeDamage(enemy);
        } else {
            int currentPlayerStamina = this.getStamina();
            this.setStamina(currentPlayerStamina - 10);
        }
    }
}
