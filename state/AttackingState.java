package state;

import context.Player;

// Concrete state: Attacking
public class AttackingState implements State {
    @Override
    public void performAction(Player player) {
        System.out.println("The player is now attacking!");
        player.attack(); // Use weapon to attack
    }

    @Override
    public void performAction(Player player,Player opponent) {
        System.out.println("The player is now attacking!");
        player.attack(); // Use weapon to attack
        int damage = player.getWeapon().getDamage();
        opponent.takeDamage(damage);

    }
}
