package practice.burgerapp;

public class Main {
    public static void main(String[] args) {

        Burger cheeseburger = new Burger("cheesyburger", "beef", 1.20, "regular");

        cheeseburger.addAddition1("Extra cheese", 1.00);
        cheeseburger.addAddition2("Extra meat", 1.10);
        System.out.println("Total: " + cheeseburger.assemble());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 2.50);
        System.out.println("Total: " + healthyBurger.assemble());
    }
}
