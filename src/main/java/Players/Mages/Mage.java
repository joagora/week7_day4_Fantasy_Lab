package Players.Mages;

import Beasts.Beast;
import Interfaces.ISpell;
import Players.Player;
import Spells.Spell;

public abstract class Mage extends Player implements ISpell {
    private Spell spell;
    private Beast defence;



    public Mage(String name) {
        super(name);
        this.spell = spell;
        this.defence = defence;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public void setDefence(Beast beast) {
        this.defence = beast;
    }

    public Beast getDefence() {
        return defence;
    }

}
