package Players.Mages;

import Beasts.Beast;
import Enemies.Enemy;
import Game.Dice;
import Interfaces.ICauseDamage;
import Players.Player;
import Spells.Spell;

public abstract class Mage extends Player {
    private Spell spell;
    private Beast defence;



    public Mage(String name, int stamina, int strength) {
        super(name, stamina, strength);
        this.spell = spell;
        this.defence = defence;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public void setDefence(Beast beast) {
        this.defence = beast;
    }

    public Beast getDefence() {
        return defence;
    }

    @Override
    public void attack(Enemy enemy){
        if (enemy.getResistanceToMagic()){
            this.setStamina(this.getStamina() - 10);
        } else {
            Dice dice = new Dice();
            int playerLuck = dice.getRandomNumber();
            int enemyLuck = dice.getRandomNumber();
            if (enemy.getStrength() + enemyLuck < this.getStrength() + playerLuck) {
                this.getSpell().causeDamage(enemy);
            } else {
                int currentPlayerStamina = this.getStamina();
                this.setStamina(currentPlayerStamina - 10);
            }
        }
    }

}
