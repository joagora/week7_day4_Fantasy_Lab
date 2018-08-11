package Interfaces;

import Enemies.Enemy;
import Players.Player;

public interface ICauseDamage {
    public void causeDamageToEnemy(Enemy opponent);
    public void causeDamageToPlayer(Player player);
}
