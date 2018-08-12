package Players.Fighters;

import Enemies.Enemy;
import Weapons.Axe;
import Weapons.Club;

public class Dwarf extends Fighter{

    private Axe axe;

    public Dwarf() {
        super("Edward", 40, 20);
        this.axe = new Axe();
        defaultWeapon();
    }

    @Override
    public void changeWeapon(){
        Club club = new Club();
        if (this.getWeapon() == this.axe){
            setWeapon(club);
        } else {
            return;
        }
    }

    public void defaultWeapon(){
        this.setWeapon(this.axe);
    }

}
