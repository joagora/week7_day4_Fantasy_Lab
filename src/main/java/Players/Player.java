package Players;


import Enemies.Enemy;
import Enemies.GameCharacter;
import Game.Dice;
import Interfaces.ICauseDamage;
import Interfaces.IFight;


public abstract class Player extends GameCharacter implements IFight {

    private ICauseDamage power;
    public Player(String name, int stamina, int strength) {
        super(name, stamina, strength);
        this.power = null;
    }

    public void setPower(ICauseDamage power) {
        this.power = power;
    }

    public void attack(Enemy enemy){
        if (enemy.getResistanceToMagic()){
            this.setStamina(this.getStamina() - 10);
        } else {
            Dice dice = new Dice();
            int playerLuck = dice.getRandomNumber();
            int enemyLuck = dice.getRandomNumber();
            if (enemy.getStrength() + enemyLuck < this.getStrength() + playerLuck) {
                this.power.causeDamageToEnemy(enemy);
            } else {
                int currentPlayerStamina = this.getStamina();
                this.setStamina(currentPlayerStamina - 10);
            }
        }
    }
}