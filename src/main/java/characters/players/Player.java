package characters.players;

import environment.TreasureType;

import java.util.ArrayList;

public abstract class Player {

    private int currentHealth;
    private int maxHealth;
    private ArrayList<TreasureType> lootBag;

    public Player() {
        this.maxHealth = 100;
        this.currentHealth = maxHealth;
        this.lootBag = new ArrayList<TreasureType>();
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getLootBag() {
        return lootBag.size();
    }

    public void pickUpLoot(TreasureType treasure) {
        this.lootBag.add(treasure);
    }

    public boolean isDead() {
        return this.currentHealth <= 0;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public boolean hasBeenHit() {
        if (this.currentHealth != 100) {
            return true;
        } else {
            return false;
        }
    }
}
