package factory.weapons;

import context.Player;
import factory.Weapon;

public class Bow implements Weapon {
    @Override
    public void attack() {
        System.out.println("Shooting arrows with the bow!");
    }

    @Override
    public int getDamage() {
       return 6;
        
    }

     @Override
    public void attack(Player opponent){
        
    }
    
}