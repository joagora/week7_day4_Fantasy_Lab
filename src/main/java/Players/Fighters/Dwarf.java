package Players.Fighters;

import Interfaces.IWeapon;
import Weapons.Axe;

public class Dwarf extends Fighter{

    private Axe axe;

    public Dwarf() {
        super("Edward");
        this.axe = new Axe();
        defaultWeapon();
    }

    @Override
    public void changeWeapon(){
    }

    public void defaultWeapon(){
        this.setWeapon(this.axe);
    }

}
