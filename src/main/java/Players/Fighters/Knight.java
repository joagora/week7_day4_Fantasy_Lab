package Players.Fighters;

import Interfaces.IWeapon;
import Weapons.Axe;
import Weapons.Sword;

public class Knight extends Fighter{

    private Sword sword;

    public Knight() {
        super("Keith");
        this.sword = new Sword();
        defaultWeapon();
    }

    @Override
    public void changeWeapon(){
        Axe axe = new Axe();
        if (this.getWeapon() == this.sword){
            setWeapon(axe);
        } else {
            return;
        }
    }

    public void defaultWeapon(){
        this.setWeapon(this.sword);
    }


}
