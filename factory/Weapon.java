package factory;
import context.Player;
public interface Weapon {
    void attack();
    int getDamage();
    void attack(Player opponent);
}
