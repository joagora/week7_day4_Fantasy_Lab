package Players.Fighters;

import Players.Player;
import Weapons.Weapon;

public abstract class Fighter extends Player {
    private Weapon weapon;


    public Fighter(String name, int stamina, int strength) {
        super(name, stamina, strength);
        this.weapon = null;
        setPower(weapon);

    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon newWeapon){
        this.weapon = newWeapon;
    }

    public abstract void changeWeapon();


}
