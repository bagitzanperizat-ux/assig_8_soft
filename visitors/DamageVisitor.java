package visitors;

import interface_visitor.Visitor;
import model.Player;
import model.Enemy;

public class DamageVisitor implements Visitor {

    private final int damageToPlayer;
    private final int damageToEnemy;

    public DamageVisitor(int damageToPlayer, int damageToEnemy) {
        this.damageToPlayer = damageToPlayer;
        this.damageToEnemy = damageToEnemy;
    }

    @Override
    public void visit(Player player) {
        int newHealth = player.getHealth() - damageToPlayer;
        player.setHealth(newHealth);
        System.out.println(player.getName() + " took " + damageToPlayer + " damage. Current HP: " + player.getHealth());
    }

    @Override
    public void visit(Enemy enemy) {
        int newStrength = enemy.getStrength() - damageToEnemy;
        enemy.setStrength(newStrength);
        System.out.println(enemy.getType() + " lost " + damageToEnemy + " power. Current Power: " + enemy.getStrength());
    }
}
