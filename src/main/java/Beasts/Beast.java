package Beasts;

public abstract class Beast {

    private String name;
    private int protection;

    public Beast(String name, int protection) {
        this.name = name;
        this.protection = protection;
    }

    public String getName() {
        return name;
    }

    public int getProtection() {
        return protection;
    }
}
