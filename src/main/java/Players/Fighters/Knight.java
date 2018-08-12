package Players.Fighters;

import Weapons.Axe;
import Weapons.Sword;

public class Knight extends Fighter{

    private Sword sword;

    public Knight() {
        super("Keith", 30, 50);
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
