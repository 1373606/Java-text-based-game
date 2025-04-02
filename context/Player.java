

package context;

// The Player class only needs to know the Product and State interfaces.
import factory.Weapon;

import state.State;

// State Pattern - Context (Player) to hold and switch states
public class Player {
    private State currentState;
    private Weapon weapon;
    private int health = 100; 

    public Player(State state, Weapon weapon) {
        this.currentState = state; // Default state is Defending
        this.weapon = weapon; // Default weapon is a sword
    }
    // Set the current state of the player
    public void setState(State state) {
        this.currentState = state;
    }
    
    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("Player Health: " + health);

    }

    // Player performs an action based on current state
    public void performAction() {
        currentState.performAction(this);
    }

    public void performAction(Player opponent) {
        currentState.performAction(this, opponent);
    }

    // Set weapon dynamically
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    // Perform the weapon's attack
    public void attack() {
        this.weapon.attack();
    }

    public void attack(Player opponent) {
        this.weapon.attack();
        int damage = weapon.getDamage();
        opponent.takeDamage(damage);
    }

   
}
