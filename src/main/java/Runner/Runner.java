package Runner;

import Enemies.Orc;
import Enemies.Troll;
import Players.Mages.Warlock;
import Players.Mages.Wizard;

public class Runner {

    public static void main(String[] args) {

        Warlock warlock = new Warlock();
        Orc orc = new Orc();


        warlock.attack(orc);




        Wizard wizard = new Wizard();

        wizard.attack(orc);


    }


}
