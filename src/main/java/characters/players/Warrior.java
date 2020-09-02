package characters.players;

import characters.players.types.WeaponType;

import java.util.Random;

public abstract class Warrior extends Player{

    private WeaponType weapon;

    public Warrior(WeaponType weapon) {
        this.weapon = weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    public int getInflictDamage() {
        int low = 0;
        int high = 12;
        int result = (int) (Math.random() * (high - low)) + low;
        return result;
    }


}
