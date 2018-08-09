package Spells;

import Interfaces.ISpell;

public class LightningSpell implements ISpell {

    private int damage;

    public LightningSpell() {
        this.damage = 40;
    }

    public int getDamage() {
        return damage;
    }
}
