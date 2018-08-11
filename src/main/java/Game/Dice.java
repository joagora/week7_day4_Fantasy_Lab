package Game;

import java.util.Random;

public class Dice {

    public Dice() {
    }

    public int getRandomNumberUpTo20(){
        Random randNum = new Random();
        return randNum.nextInt(21);
    }

    public int getRandomNumber(int maxValue){
        Random randNum = new Random();
        return randNum.nextInt(maxValue + 1);
    }
}
