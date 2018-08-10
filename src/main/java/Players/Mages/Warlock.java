package Players.Mages;

import Beasts.Ogre;
import Enemies.Enemy;
import Spells.FireSpell;
import Spells.LightningSpell;

public class Warlock extends Mage{
    private Ogre defaultDefence;
    private LightningSpell defaultSpell;
    private int stamina;

    public Warlock() {
        super("Robbie");
        this.defaultSpell = new LightningSpell();
        this.defaultDefence = new Ogre();
        this.stamina = 50;
        setDefaultDefence();
        setDefaultSpell();
    }

    public void setDefaultSpell(){
        this.setSpell(this.defaultSpell);
    }
    public void setDefaultDefence(){
        this.setDefence(this.defaultDefence);
    }

    @Override
    public void attack(Enemy enemy){

    }

}
