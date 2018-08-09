package Beasts;

import Interfaces.IDefend;

public class Dragon implements IDefend {
    private String name;
    private int protection;

    public Dragon() {
        this.name = "Dinosaur";
        this.protection = 30;
    }

    public String getName() {
        return name;
    }
}
