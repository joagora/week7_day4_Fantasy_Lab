package Players.Fighters;

import Interfaces.IWeapon;
import Players.Player;

public abstract class Fighter extends Player {
    private IWeapon weapon;

    public Fighter(String name) {
        super(name);
        this.weapon = null;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon newWeapon){
        this.weapon = newWeapon;
    }

    public abstract void changeWeapon();
}
