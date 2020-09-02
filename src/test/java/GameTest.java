import characters.enemies.Enemy;
import characters.enemies.Orc;
import characters.enemies.Troll;
import environment.EnemyRoom;
import environment.Room;
import game.Game;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    ArrayList<Room> rooms;
    ArrayList<Enemy> enemies;
    EnemyRoom room1;

    @Before
    public void before() {
        rooms = new ArrayList<Room>();
        room1 = new EnemyRoom();
        rooms.add(room1);
        rooms.add(new EnemyRoom());
        rooms.add(new EnemyRoom());

        enemies = new ArrayList<Enemy>();
        enemies.add(new Troll());
        enemies.add(new Orc());
        enemies.add(new Orc());
        game = new Game();
        game.setUpGame(rooms, enemies);
    }

    @Test
    public void canSetUpGame() {
        assertEquals(3, game.getNumberOfRooms());
        assertEquals(3, room1.getEnemies());
    }

}
