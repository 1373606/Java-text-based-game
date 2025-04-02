package strategy;

import state.AttackingState;
import context.Player;

// Concrete strategy: Aggressive combat strategy
public class AggressiveStrategy implements Strategy {
    @Override
    public void setStrategy(Player player) {
        System.out.println("The player uses an aggressive combat strategy!");
        player.setState(new AttackingState()); // Switch to attacking state
    }
}