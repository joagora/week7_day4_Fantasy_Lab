package Players.Fighters;

import Interfaces.IWeapon;
import Players.Player;
import Weapons.Weapon;

public abstract class Fighter extends Player implements IWeapon {
    private Weapon weapon;
    private int stamina;
    private int strength;

    public Fighter(String name, int stamina, int strength) {
        super(name);
        this.weapon = null;
        this.stamina = stamina;
        this.strength = strength;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon newWeapon){
        this.weapon = newWeapon;
    }

    public abstract void changeWeapon();
}
