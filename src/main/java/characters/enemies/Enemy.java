package characters.enemies;

import behaviours.IRetaliate;
import characters.players.Player;

public abstract class Enemy implements IRetaliate {
    private int currentHealth;

    public Enemy() {
        this.currentHealth = 30;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public boolean hasBeenHit() {
        if (this.currentHealth != 30) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDead() {
        return this.currentHealth <= 0;
    }

    public void retaliate(Player player) {
        if (this.hasBeenHit() == true) {
            int newHealth = player.getCurrentHealth() - this.getInflictDamage();
            player.setCurrentHealth(newHealth);
        }
    }

    public int getInflictDamage() {
        int low = 0;
        int high = 30;
        int result = (int) (Math.random() * (high - low)) + low;
        return result;
    }
}
