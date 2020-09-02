package characters.enemies;

public abstract class Enemy {
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
}
