package state;

import context.Player;

// Concrete state: Defending
public class DefendingState implements State {
    @Override
    public void performAction(Player player) {
        System.out.println("The player is defending!");
        // No weapon action while defending
    }

    @Override
    public void performAction(Player player, Player opponent) {
        System.out.println("The player is defending!");
        // No weapon action while defending
    }
}
