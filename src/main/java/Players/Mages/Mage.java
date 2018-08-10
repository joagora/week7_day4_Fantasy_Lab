package Players.Mages;

import Interfaces.IDefend;
import Players.Player;
import Spells.Spell;

public abstract class Mage extends Player{
    private Spell spell;
    private IDefend defence;



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

    public void setDefence(IDefend defence) {
        this.defence = defence;
    }

    public IDefend getDefence() {
        return defence;
    }

}
