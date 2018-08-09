package Beasts;

import Interfaces.IDefend;

public class Ogre implements IDefend {

    private String name;

    public Ogre() {
        this.name = "Shmurk";
    }

    public String getName() {
        return name;
    }
}
