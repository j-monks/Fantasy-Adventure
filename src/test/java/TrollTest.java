import characters.enemies.Troll;
import characters.players.Barbarian;
import characters.players.types.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll;
    Barbarian barbarian;

    @Before
    public void before() {
        troll = new Troll();
        barbarian = new Barbarian(WeaponType.CLUB);
    }

    @Test
    public void hasCurrentHealth() {
        assertEquals(30, troll.getCurrentHealth());
    }

    @Test
    public void isDead() {
        assertEquals(false, troll.isDead());
    }

//    @Test
//    public void canBeKilled() {
//        barbarian.fight(troll);
//        barbarian.fight(troll);
//        barbarian.fight(troll);
//        barbarian.fight(troll);
//        assertEquals(true, troll.isDead());
//    }

    @Test
    public void canRetaliate() {
        barbarian.fight(troll);
        troll.retaliate(barbarian);
        assertEquals(true, barbarian.hasBeenHit());
    }


}
