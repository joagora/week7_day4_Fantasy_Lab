package Enemies;

import Weapons.Club;
import Weapons.Weapon;

public class Orc extends Enemy {


    public Orc() {
        super("Trevor", 30, 20, false);
        this.setWeapon(new Club());
    }


}
