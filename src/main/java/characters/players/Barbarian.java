package characters.players;

import characters.enemies.Enemy;
import characters.players.types.WeaponType;

public class Barbarian extends Warrior{

    public Barbarian(WeaponType weapon) {
        super(weapon);
    }

    public int rage() {
        if (this.getCurrentHealth() == 5) {
            return this.getInflictDamage() * 2;
        } else {
            return this.getInflictDamage();
        }
    }

    public void fight(Enemy enemy) {
        int damageDealt = this.rage();
        int newHealth = enemy.getCurrentHealth() - damageDealt;
        enemy.setCurrentHealth(newHealth);
    }
}
