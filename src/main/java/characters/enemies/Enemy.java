package characters.enemies;

public abstract class Enemy {
    private int currentHealth;

    public Enemy() {
        this.currentHealth = 30;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }
}
