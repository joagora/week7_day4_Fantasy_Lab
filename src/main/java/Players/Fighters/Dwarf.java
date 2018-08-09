package Players.Fighters;

import Interfaces.IWeapon;

public class Dwarf extends Fighter{

    public Dwarf(IWeapon weapon) {
        super(weapon);
    }

    @Override
    public void changeWeapon(IWeapon weapon){
        setWeapon(weapon);
    }

}
