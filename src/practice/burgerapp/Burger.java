package practice.burgerapp;

public class Burger {
    private String name;
    private String meat;
    private double price;
    private String buns;

    private String addition1;
    private double addition1Price;

    private String addition2;
    private double addition2Price;

    private String addition3;
    private double addition3Price;

    private String addition4;
    private double addition4Price;


    public Burger(String name, String meat, double price, String buns) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.buns = buns;
    }

    public void addAddition1(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void addAddition2(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void addAddition3(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void addAddition4(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
