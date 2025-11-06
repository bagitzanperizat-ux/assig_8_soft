package interface_visitor;

import model.Player;
import model.Enemy;

public interface Visitor {
    void visit(Player player);
    void visit(Enemy enemy);
}
