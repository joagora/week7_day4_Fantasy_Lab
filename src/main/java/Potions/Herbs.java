package Potions;

import Players.Player;

public class Herbs extends Medicine {

    public Herbs() {
        super(20);
    }

    public void restoreHealth(Player player){
        if (player.getHealth() > 80) {
            player.setHealth(100);
        } else {
            player.setHealth(player.getHealth() + this.getHealthRestoration());
        }

    }
}
