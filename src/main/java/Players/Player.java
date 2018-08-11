package Players;

import Enemies.Enemy;

public abstract class Player {
    private String name;
    private int health;
    private int stamina;
    private int strength;

    public Player(String name, int stamina, int strength) {
        this.name = name;
        this.stamina = stamina;
        this.strength = strength;
        this.health = 100;
    }

    public int getHealth() {
        return health;
    }

    public int getStamina() {
        return stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStamina(int newStamina){
        this.stamina = newStamina;
    }

    public abstract void attack(Enemy enemy);
}
