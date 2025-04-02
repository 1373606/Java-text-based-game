import java.util.Scanner;

import context.Player;
import factory.Factory;
import state.*;
import strategy.*;

public class Game {
    public static void main(String[] args) {
        // Create a new player
        Player hero = new Player(new DefendingState(), Factory.createWeapon("sword"));
        Player enemy = new Player(new AttackingState(), Factory.createWeapon("bow"));
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a weapon:" +
                "\n1: Axe" +
                "\n2: Sword" +
                "\n3: Bow");
        int chosen = scanner.nextInt();

        switch (chosen) {
            case 1:
                hero.setWeapon(Factory.createWeapon("axe"));
                break;
            case 2:
                hero.setWeapon(Factory.createWeapon("sword"));
                break;
            case 3:
                hero.setWeapon(Factory.createWeapon("bow"));
            default:
                break;
        }


        while (hero.getHealth() > 0 && enemy.getHealth() > 0) {
            // Display the status
            System.out.println("\nYour Health: " + hero.getHealth() + " | Enemy Health: " + enemy.getHealth());

            // Ask for the player to choose an action
            System.out.println("\nChoose your action:" +
                    "\n1: Attack" +
                    "\n2: Defend" +
                    "\n3: Switch Strategy");
            int actionChoice = scanner.nextInt();

            switch (actionChoice) {
                case 1:
                    // Perform attack action
                    hero.setWeapon(Factory.createWeapon("sword"));  // You can dynamically change the weapon here
                    hero.performAction(enemy); // This should deal damage based on the strategy and weapon
                    enemy.takeDamage(hero.getWeapon().getDamage());
                    break;
                case 2:
                    // Perform defend action
                    // hero.setWeapon(Factory.createWeapon("shield")); // Just an example; you'd need to create this weapon
                    hero.performAction(enemy); // Perform defense logic
                    break;
                case 3:
                    // Switch between aggressive or defensive strategy
                    System.out.println("Choose a strategy:" +
                            "\n1: Aggressive" +
                            "\n2: Defensive");
                    int strategyChoice = scanner.nextInt();
                    Strategy chosenStrategy = (strategyChoice == 1) ? new AggressiveStrategy() : new DefensiveStrategy();
                    chosenStrategy.setStrategy(hero);
                    break;
                default:
                    System.out.println("Invalid action. Please try again.");
                    continue;
            }

            // Enemy action (this could be randomized or based on its strategy)
            System.out.println("\nThe enemy attacks!");
            enemy.performAction(hero); // This should also do damage or take other actions
            
            hero.takeDamage(enemy.getWeapon().getDamage());; // Example damage from enemy

            // Check for end of combat
            if (hero.getHealth() <= 0) {
                System.out.println("You have been defeated.");
                break;
            }
            if (enemy.getHealth() <= 0) {
                System.out.println("You have defeated the enemy!");
                break;
            }
        }

        scanner.close();


    }
}
