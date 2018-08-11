package Weapons;

import Enemies.Enemy;
import Interfaces.ILightSide;

public class Club extends Weapon implements ILightSide {

    public Club() {
        super(10, "Spikey");
    }
}
