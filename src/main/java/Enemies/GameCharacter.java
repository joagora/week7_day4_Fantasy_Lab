package Enemies;

public abstract class GameCharacter {
    private String name;
    private int health;
    private int stamina;
    private int strength;

    public GameCharacter(String name, int stamina, int strength){
        this.name = name;
        this.health = 100;
        this.stamina = stamina;
        this.strength = strength;
    }

    public String getName() {
        return name;
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

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void decreaseStamina(int value){
        this.setStamina(getStamina() - value);
    }



}
