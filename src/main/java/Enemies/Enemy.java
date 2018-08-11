package Enemies;


import Game.Dice;
import Interfaces.IFight;
import Players.Player;
import Weapons.Weapon;

public abstract class Enemy extends GameCharacter implements IFight {

    private boolean resistanceToMagic;
    private Weapon weapon;

    public Enemy(String name, int stamina, int strength, boolean resistanceToMagic) {
        super(name, stamina, strength);
        this.resistanceToMagic = resistanceToMagic;
        this.weapon = null;
    }

    public Weapon getWeapon() {
        return weapon;
    }


    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public boolean getResistanceToMagic() {
        return resistanceToMagic;
    }


    public void attack(Player player){
        Dice dice = new Dice();
        int playerLuck = dice.getRandomNumberUpTo20();
        int enemyLuck = dice.getRandomNumberUpTo20();
        System.out.println(playerLuck);
        System.out.println(enemyLuck);
        if (player.getStrength() + playerLuck <= this.getStrength() + enemyLuck) {
            this.getWeapon().causeDamageToPlayer(player);
        } else {
            decreaseStamina(15);
        }

    }
}
