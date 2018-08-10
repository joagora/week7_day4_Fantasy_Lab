package Enemies;

public abstract class Enemy {
    private String name;
    private int health;
    private int stamina;
    private int strength;

    public Enemy(String name, int stamina, int strength) {
        this.name = name;
        this.health = 100;
        this.stamina = stamina;
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
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
}
