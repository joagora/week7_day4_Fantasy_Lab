package Players.Fighters;

import Interfaces.IWeapon;
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

    }

    public void defaultWeapon(){
        this.setWeapon(this.sword);
    }


}
