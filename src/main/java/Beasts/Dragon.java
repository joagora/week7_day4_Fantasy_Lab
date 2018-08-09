package Beasts;

import Interfaces.IDefend;

public class Dragon implements IDefend {
    private String name;

    public Dragon() {
        this.name = "Dinosaur";
    }

    public String getName() {
        return name;
    }
}
