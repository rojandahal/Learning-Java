package com.rojan;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", 234.68, "Chicken", "Baked Brown Bread");
        super.addHamburgerItem1("Drinks",40);
        super.addHamburgerItem2("Chips",45);
    }

    @Override
    public void addHamburgerItem1(String addItem1, double priceItem1) {
        System.out.println("Cannot add item to Deluxe package. ");
    }

    @Override
    public void addHamburgerItem2(String addItem2, double priceItem2) {
        System.out.println("Cannot add item to Deluxe package. ");    }

    @Override
    public void addHamburgerItem3(String addItem3, double priceItem3) {
        System.out.println("Cannot add item to Deluxe package. ");    }

    @Override
    public void addHamburgerItem4(String addItem4, double priceItem4) {
        System.out.println("Cannot add item to Deluxe package. ");    }

}
