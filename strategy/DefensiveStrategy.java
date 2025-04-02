package strategy;

import state.DefendingState;
import context.Player;

// Concrete strategy: Defensive combat strategy
public class DefensiveStrategy implements Strategy {
    @Override
    public void setStrategy(Player player) {
        System.out.println("The player uses a defensive combat strategy!");
        player.setState(new DefendingState()); // Switch to defending state
    }
}