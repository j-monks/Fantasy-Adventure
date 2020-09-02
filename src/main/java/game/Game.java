package game;

import characters.enemies.Enemy;
import characters.enemies.Troll;
import environment.EnemyRoom;
import environment.Room;

import java.util.ArrayList;

public class Game {

    private ArrayList<Room> rooms;

    public void setUpGame(ArrayList<Room> rooms, ArrayList<Enemy> enemies) {
        this.rooms = rooms;
        for (Room i : rooms) {
            if (i instanceof EnemyRoom) {
                i.setEnemies(enemies);
            }
        }
    }

    public int getNumberOfRooms() {
        return this.rooms.size();
    }
}
