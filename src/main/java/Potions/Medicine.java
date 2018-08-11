package Potions;

import Players.Player;

public abstract class Medicine {

    private int healthRestoration;

    public Medicine(int healthRestoration){
        this.healthRestoration = healthRestoration;
    }

    public int getHealthRestoration() {
        return healthRestoration;
    }

    public void restoreHealth(Player player){
        if (player.getHealth() > (100 - healthRestoration)) {
            player.setHealth(100);
        } else {
            player.setHealth(player.getHealth() + this.healthRestoration);
        }

    }
}
