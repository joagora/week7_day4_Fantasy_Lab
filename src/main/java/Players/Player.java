package Players;

public abstract class Player {
    private String name;
    private int health;

    public Player(String name) {
        this.name = name;
        this.health = 100;
    }

    public int getHealth() {
        return health;
    }
}
