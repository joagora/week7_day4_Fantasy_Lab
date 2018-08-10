package Enemies;

public abstract class Enemy {
    private String name;
    private int health;

    public Enemy(String name) {
        this.name = name;
        this.health = 100;
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
}
