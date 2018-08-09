package Players.Fighters;

import Interfaces.IWeapon;

public abstract class Fighter {
    private IWeapon weapon;

    public Fighter(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void setWeapon(IWeapon newWeapon){
        this.weapon = newWeapon;
    }

    public abstract void changeWeapon(IWeapon newWeapon);
}
