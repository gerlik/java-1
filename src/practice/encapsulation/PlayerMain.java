package practice.encapsulation;

public class PlayerMain {

    public static void main(String[] args) {
/*        Player player = new Player();
        player.fullName = "Gerli";
        //player.health = 100;
        player.weapon = "Fork and a frying pan";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health: " + player.healthRemaining());

        damage = 100;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health: " + player.healthRemaining());*/

        EnhancedPlayer player = new EnhancedPlayer("Gerli", 50, "Sword");
        System.out.println("Health: " + player.getHealth());

    }
}
