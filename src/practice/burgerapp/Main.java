package practice.burgerapp;

public class Main {
    public static void main(String[] args) {

        Burger cheeseburger = new Burger("Cheesyburger", "beef", 1.20, "Regular");
        cheeseburger.addAddition1("Extra cheese", 1.00);
        cheeseburger.addAddition2("Extra meat", 1.00);
        System.out.println("Total: " + cheeseburger.assemble());
        System.out.println();

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 2.80);
        //System.out.println("Total: " + healthyBurger.assemble());
        healthyBurger.addHealthAddition1("Tomato", 0.50);
        healthyBurger.addHealthAddition2("Egg", 0.90);
        System.out.println("Total healthy price: " + healthyBurger.assemble());
        System.out.println();

        DeluxeBurger deluxe = new DeluxeBurger();

        //Shoult not be able to add any extras
        deluxe.addAddition3("Test", 0.50);
        deluxe.assemble();
    }
}
