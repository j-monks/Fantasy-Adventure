import characters.enemies.Troll;
import characters.players.Barbarian;
import characters.players.types.WeaponType;
import environment.TreasureType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    TreasureType treasureType;
    Troll troll;

    @Before
    public void before() {
        barbarian = new Barbarian(WeaponType.SWORD);
        treasureType = TreasureType.DIAMOND;
        troll = new Troll();
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

//    @Test
//    public void canGetRandomNumber() {
//        assertEquals(0, barbarian.getInflictDamage());
//    }

    @Test
    public void canFight() {
        barbarian.fight(troll);
        assertEquals(true, troll.hasBeenHit());
    }

}
