package factory.weapons;

import context.Player;
import factory.Weapon;

public class Axe implements Weapon {
    @Override
    public void attack() {
        System.out.println("Swinging the axe with great force!");
    }

    @Override
    public int getDamage() {
        return 4;
    }

    @Override
    public void attack(Player opponent){

    }
    
    
    


}