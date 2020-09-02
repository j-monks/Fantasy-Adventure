import characters.players.Barbarian;
import environment.TreasureType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    TreasureType treasureType;

    @Before
    public void before() {
        barbarian = new Barbarian();
        treasureType = TreasureType.DIAMOND;
    }

    @Test
    public void hasCurrentHealth() {
        assertEquals(100, barbarian.getCurrentHealth());
    }

    @Test
    public void hasMaxHealth() {
        assertEquals(100, barbarian.getMaxHealth());
    }

    @Test
    public void startsWithEmptyLootBag() {
        assertEquals(0, barbarian.getLootBag());
    }

    @Test
    public void canPickUpLoot() {
        barbarian.pickUpLoot(treasureType);
        assertEquals(1, barbarian.getLootBag());
    }

    @Test
    public void isNotDead() {
        assertEquals(false, barbarian.isDead());
    }

}
