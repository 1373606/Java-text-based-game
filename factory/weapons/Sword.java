package factory.weapons;

import context.Player;
import factory.Weapon;

// Concrete class: Sword
public class Sword implements Weapon {
    @Override
    public void attack() {
        System.out.println("Swinging the sword for a melee attack!");
    }

    @Override
    public int getDamage() {
        return 7;
    }

     @Override
    public void attack(Player opponent){
        
    }
    
}