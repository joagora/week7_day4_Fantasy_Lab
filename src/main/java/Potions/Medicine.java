package Potions;

import Players.Player;

public abstract class Medicine {

    private int healthRestoration;

    public Medicine(int healthRestoration){
        this.healthRestoration = healthRestoration;
    }

    public abstract void restoreHealth(Player player);

    public int getHealthRestoration() {
        return healthRestoration;
    }
}
