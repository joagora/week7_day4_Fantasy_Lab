package Enemies;

import Weapons.MorningStar;


public class Orc extends Enemy {


    public Orc() {
        super("Trevor", 20, 30, false);
        this.setWeapon(new MorningStar());
    }
}
