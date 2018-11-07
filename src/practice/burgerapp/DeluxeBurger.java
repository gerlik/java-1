package practice.burgerapp;

public class DeluxeBurger extends Burger {
    @Override
    public void addAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    public DeluxeBurger() {
        super("Deluxe", "3 meat pattys", 14.50, "Regular with sesame seeds");
        super.addAddition1("Chips", 1.20);
        super.addAddition2("Drink", 1.00);


    }
}
