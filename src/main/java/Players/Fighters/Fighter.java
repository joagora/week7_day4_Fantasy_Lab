package Players.Fighters;

import Interfaces.IWeapon;
import Players.Player;
import Weapons.Weapon;

public abstract class Fighter extends Player implements IWeapon {
    private Weapon weapon;


    public Fighter(String name, int stamina, int strength) {
        super(name, stamina, strength);
        this.weapon = null;

    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon newWeapon){
        this.weapon = newWeapon;
    }

    public abstract void changeWeapon();
}
