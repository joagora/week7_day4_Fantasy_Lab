package Spells;

import Interfaces.ISpell;

public class FreezeSpell implements ISpell {

    private int damage;

    public FreezeSpell() {
        this.damage = 30;
    }

    public int getDamage() {
        return damage;
    }
}
