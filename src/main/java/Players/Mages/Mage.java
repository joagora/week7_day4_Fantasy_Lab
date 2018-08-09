package Players.Mages;

import Interfaces.IDefend;
import Interfaces.ISpell;
import Players.Player;

public abstract class Mage extends Player{
    private ISpell spell;
    private IDefend defence;



    public Mage(String name) {
        super(name);
        this.spell = spell;
        this.defence = defence;
    }

    public ISpell getSpell() {
        return spell;
    }

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }

    public void setDefence(IDefend defence) {
        this.defence = defence;
    }

    public IDefend getDefence() {
        return defence;
    }
}
