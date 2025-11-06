package visitors;

import interface_visitor.Visitor;
import model.Player;
import model.Enemy;

public class HealVisitor implements Visitor {

    private final int healAmount;

    public HealVisitor(int healAmount) {
        this.healAmount = healAmount;
    }

    @Override
    public void visit(Player player) {
        int newHealth = player.getHealth() + healAmount;
        player.setHealth(newHealth);
        System.out.println(player.getName() + " healed by " + healAmount + ". Current HP: " + player.getHealth());
    }

    @Override
    public void visit(Enemy enemy) {
        int newPower = enemy.getStrength() + healAmount / 2;
        enemy.setStrength(newPower);
        System.out.println(enemy.getType() + " regenerated " + healAmount / 2 + " power. Current Power: " + enemy.getStrength());
    }
}
