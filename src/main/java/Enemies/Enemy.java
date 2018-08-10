package Enemies;

public abstract class Enemy {
    private String name;
    private int health;
    private int stamina;
    private int strength;
    private boolean resistanceToMagic;

    public Enemy(String name, int stamina, int strength, boolean resistanceToMagic) {
        this.name = name;
        this.health = 100;
        this.stamina = stamina;
        this.strength = strength;
        this.resistanceToMagic = resistanceToMagic;
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

    public boolean getResistanceToMagic() {
        return resistanceToMagic;
    }
}
