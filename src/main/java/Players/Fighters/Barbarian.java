package Players.Fighters;

import Interfaces.IWeapon;
import Weapons.Axe;
import Weapons.Club;

public class Barbarian extends Fighter{


    private Club club;

    public Barbarian() {
        super("Steve", 15, 60);
        this.club = new Club();
        defaultWeapon();
    }

    @Override
    public void changeWeapon(){
        Axe axe = new Axe();
        if (this.getWeapon() == this.club){
            setWeapon(axe);
        } else {
            return;
        }
    }

    public void defaultWeapon(){
        this.setWeapon(this.club);
    }
}
