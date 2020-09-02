package environment;

import characters.enemies.Enemy;
import characters.players.Player;

import java.util.ArrayList;

public abstract class Room {
    private ArrayList<Player> players;
    private ArrayList<Enemy> enemies;
    private ArrayList<TreasureType> treasures;

    public Room() {
        this.players = new ArrayList<Player>();
        this.enemies = new ArrayList<Enemy>();
        this.treasures = new ArrayList<TreasureType>();
    }

    public int getEnemies() {
        return enemies.size();
    }

    public int getTreasures() {
        return treasures.size();
    }

    public int getPlayers() {
        return players.size();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void addEnemy(Enemy enemy) {
        this.enemies.add(enemy);
    }
    public void setEnemies(ArrayList<Enemy> enemies) {
        this.enemies = enemies;
    }

}
