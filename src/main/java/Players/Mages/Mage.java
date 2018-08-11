package Players.Mages;

import Beasts.Beast;
import Enemies.Enemy;
import Game.Dice;
import Players.Player;
import Spells.Spell;

public abstract class Mage extends Player {
    private Spell spell;
    private Beast defence;



    public Mage(String name, int stamina, int strength) {
        super(name, stamina, strength);
        this.spell = spell;
        this.defence = defence;
        setPower(spell);
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
