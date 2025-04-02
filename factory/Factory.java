package factory;
// Factory Pattern - This class will create different weapon types for the player

import factory.weapons.Axe;
import factory.weapons.Bow;
import factory.weapons.Sword;

public class Factory {
    
    // Factory method to create a weapon
    public static Weapon createWeapon(String type) {
        switch (type.toLowerCase()) {
            case "sword":
                return new Sword();
            case "bow":
                return new Bow();
            case "axe":
                return new Axe();
            default:
                throw new IllegalArgumentException("Unknown weapon type.");
        }
    }
}
