package Players.Mages;

import Beasts.Ogre;
import Spells.LightningSpell;

public class Warlock extends Mage{
    private Ogre defaultDefence;
    private LightningSpell defaultSpell;

    public Warlock() {
        super("Robbie", 40, 20);
        this.defaultSpell = new LightningSpell();
        this.defaultDefence = new Ogre();
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
