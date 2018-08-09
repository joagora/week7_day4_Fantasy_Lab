package Spells;

import Interfaces.ISpell;

public class FireSpell implements ISpell {

    private int damage;

    public FireSpell() {
        this.damage = 50;
    }

    public int getDamage() {
        return damage;
    }
}
