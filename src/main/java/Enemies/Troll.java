package Enemies;

import Weapons.Club;

public class Troll extends Enemy {
    public Troll() {
        super("Derek", 10, 40, true);
        setWeapon(new Club());
    }
}
