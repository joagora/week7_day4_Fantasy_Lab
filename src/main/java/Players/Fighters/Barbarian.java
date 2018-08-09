package Players.Fighters;

import Interfaces.IWeapon;
import Weapons.Club;

public class Barbarian extends Fighter{


    private Club club;

    public Barbarian() {
        super("Steve");
        this.club = new Club();
        defaultWeapon();
    }

    @Override
    public void changeWeapon(IWeapon weapon){
        setWeapon(weapon);
    }

    public void defaultWeapon(){
        this.setWeapon(this.club);
    }
}
