package Runner;

import Enemies.Orc;
import Enemies.Troll;
import Players.Mages.Warlock;
import Players.Mages.Wizard;

public class Runner {

    public static void main(String[] args) {
        Troll troll = new Troll();
        Warlock warlock = new Warlock();


        System.out.println(warlock.getStamina());
        System.out.println(troll.getHealth());
        System.out.println(warlock.getHealth());
        warlock.attack(troll);
        System.out.println(warlock.getStamina());
        System.out.println(troll.getHealth());
        System.out.println(warlock.getHealth());


        Orc orc = new Orc();
        Wizard wizard = new Wizard();
        System.out.println(" ");
        System.out.println(warlock.getStamina());
        System.out.println(orc.getHealth());
        System.out.println(warlock.getHealth());
        wizard.attack(orc);
        System.out.println(warlock.getStamina());
        System.out.println(orc.getHealth());
        System.out.println(warlock.getHealth());

    }


}
