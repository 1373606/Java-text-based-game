# Review Exercises

This program uses three clearly defined design patterns.  Two of them you have seen and will recognise, the third you might not. 


1. Please review all the code, walking through all steps of code execution. It is best to do this as the program is running in debug mode with some breakpoints. 
2. What design patterns are in use? Can you identify their structure and purpose? 
3. Once complete, modify the program, following each of the requirements in the list below. 


## Requirements

- The game only loads one player. Instantiate another player object in the Game class. 
- The player needs a starting amount of health. Add this with a starting value of 100 to the Player class. Create it as a private variable
- Add a new abstract method `int getDamage()` to the Product class. 
- Implement this method in the derived classes (Axe, Bow etc). It will return a fixed value between 1 and 10 (you can add this as a static value for each weapon)
- Players do not interact when attacking or defending. Modify the attack method in player so it receives a Player object as its only parameter.
- There needs to be a way to get the damage amount from the weapon to the opposing player. Implement a method `takeDamage(int hitPoints)` in the Player class. It will reduce the player health by the given amount when called. 
- now overload the performAction abstract method in State interface with `void performAction(Player player, Player opponent);`. This is on a new line. Do not overwrite the existing method. 
- Implement the method in the derived classes. in this method, the opponent object calls the takeDamage method, passing the value from getDamage of the weapon
- Add a getter for player health in Player.java. Call this in game.java for each player after performing an action


## Bonus requirements

- If an opponent is in the defensive state and is attacked, the amount of damage taken should halve.
- If an opponent is in the attacking strategy and is attacked, the amount of damge should double. 
- Implement a few new weapons in the factory package. 
- If any players health goes to 0, the other player wins and the game ends. 
- Implement user controls to attack and defend.
- Implement a menu system to select from the available weapons. 
- 

