package Players;


import Enemies.Enemy;
import Enemies.GameCharacter;
import Enums.ExitType;
import Game.Dice;
import Interfaces.ICauseDamage;
import Interfaces.IFight;
import Quests.Quest;
import Rooms.IcyCaveRoom;
import Rooms.Room;


public abstract class Player extends GameCharacter implements IFight {

    private ICauseDamage power;
    private Room currentLocation;
    public Player(String name, int stamina, int strength) {
        super(name, stamina, strength);
        this.power = null;
        this.currentLocation = null;
    }

    public void setPower(ICauseDamage power) {
        this.power = power;
    }

    public Room getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Room currentLocation) {
        this.currentLocation = currentLocation;
    }

    public void attack(Enemy enemy){
        if (enemy.getResistanceToMagic()){
            this.setStamina(this.getStamina() - 10);
        } else {
            Dice dice = new Dice();
            int playerLuck = dice.getRandomNumberUpTo20();
            int enemyLuck = dice.getRandomNumberUpTo20();
            if (enemy.getStrength() + enemyLuck < this.getStrength() + playerLuck) {
                this.power.causeDamageToEnemy(enemy);
            } else {
                int currentPlayerStamina = this.getStamina();
                this.setStamina(currentPlayerStamina - 10);
            }
        }
    }


}