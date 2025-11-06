import model.Player;
import model.Enemy;
import visitors.DamageVisitor;
import visitors.HealVisitor;


public class GameDemo {

    public static void main(String[] args) {

        String GAME_START = "\n--- Game Start ---";
        String DAMAGE_PHASE = "\n--- Damage Phase ---";
        String HEAL_PHASE = "\n--- Heal Phase ---";
        String GAME_END = "\n--- Game End ---";

        String playerName = "Kevin";
        int playerHealth = 100;

        String enemyName = "Riko";
        int enemyHealth = 50;

        Player player = new Player(playerName, playerHealth);
        Enemy enemy = new Enemy(enemyName, enemyHealth);


        int playerDamage = 30;
        int enemyDamage = 20;
        int healAmount = 15;

        DamageVisitor damageVisitor = new DamageVisitor(playerDamage, enemyDamage);
        HealVisitor healVisitor = new HealVisitor(healAmount);

        // Этап начала игры
        System.out.println(GAME_START);
        System.out.println(player);
        System.out.println(enemy);

        // Этап урона
        System.out.println(DAMAGE_PHASE);
        player.accept(damageVisitor);
        enemy.accept(damageVisitor);

        // Этап лечения
        System.out.println(HEAL_PHASE);
        player.accept(healVisitor);
        enemy.accept(healVisitor);

        // Конец игры
        System.out.println(GAME_END);
        System.out.println(player);
        System.out.println(enemy);
    }
}

