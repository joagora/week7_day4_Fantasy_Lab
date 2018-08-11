package Enemies;


import Game.Dice;
import Players.Player;
import Weapons.Weapon;

public abstract class Enemy {
    private String name;
    private int health;
    private int stamina;
    private int strength;
    private boolean resistanceToMagic;
    private Weapon weapon;

    public Enemy(String name, int stamina, int strength, boolean resistanceToMagic) {
        this.name = name;
        this.health = 100;
        this.stamina = stamina;
        this.strength = strength;
        this.resistanceToMagic = resistanceToMagic;
        this.weapon = null;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getStamina() {
        return stamina;
    }

    public int getStrength() {
        return strength;
    }

    public boolean getResistanceToMagic() {
        return resistanceToMagic;
    }

    public void attackPlayer(Player player){
        Dice dice = new Dice();
        int playerLuck = dice.getRandomNumber();
        int enemyLuck = dice.getRandomNumber();

        if (player.getStrength() + playerLuck <= this.getStrength() + enemyLuck) {

        }
    }
}
