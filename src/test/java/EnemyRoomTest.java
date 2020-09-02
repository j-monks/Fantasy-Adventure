import characters.enemies.Enemy;
import characters.enemies.Troll;
import characters.players.Barbarian;
import characters.players.types.WeaponType;
import environment.EnemyRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyRoomTest {

    EnemyRoom enemyRoom;
    Barbarian barbarian;
    Troll troll;

    @Before
    public void before() {
        enemyRoom = new EnemyRoom();
        barbarian = new Barbarian(WeaponType.SWORD);
        troll = new Troll();
    }

    @Test
    public void canAddPlayer() {
        assertEquals(0, enemyRoom.getPlayers());
        enemyRoom.addPlayer(barbarian);
        assertEquals(1, enemyRoom.getPlayers());
    }

    @Test
    public void canAddEnemy() {
        assertEquals(0, enemyRoom.getEnemies());
        enemyRoom.addEnemy(troll);
        assertEquals(1, enemyRoom.getEnemies());
    }
}
