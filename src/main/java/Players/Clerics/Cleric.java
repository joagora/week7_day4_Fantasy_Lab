package Players.Clerics;

import Players.Player;
import Potions.Medicine;
import Potions.Potion;

public class Cleric extends Player {
    private Medicine medicine;
    public Cleric(String name, int stamina, int strength) {
        super(name, stamina, strength);
        this.medicine = new Potion();
    }
}
