package Players.Mages;

import Beasts.Dragon;
import Enemies.Enemy;
import Spells.FireSpell;

public class Wizard extends Mage{
    private Dragon defaultDefence;
    private FireSpell defaultSpell;

    public Wizard() {
        super("Colin", 30, 10);
        this.defaultSpell = new FireSpell();
        this.defaultDefence = new Dragon();
        setDefaultDefence();
        setDefaultSpell();
    }

    public void setDefaultSpell(){
        this.setSpell(this.defaultSpell);
    }
    public void setDefaultDefence(){
        this.setDefence(this.defaultDefence);
    }

}
