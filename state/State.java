package state;

import context.Player;

// State Pattern - State interface
public interface State {
    void performAction(Player player);
    void performAction(Player player, Player opponent);
}
