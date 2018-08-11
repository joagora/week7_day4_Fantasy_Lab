package Game;

import java.util.Random;

public class Dice {
    private int roll;

    public Dice() {
        this.roll = getRandomNumber();
    }

    public int getRandomNumber(){
        Random randNum = new Random();
        return randNum.nextInt(21);
    }
}
