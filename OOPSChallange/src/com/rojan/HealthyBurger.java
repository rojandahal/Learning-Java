package com.rojan;

public class HealthyBurger extends Hamburger {
    public HealthyBurger(double price, String meat) {
        super("Healthy ", price, meat, "Brown Rye Roll");
    }
    private String addItem5;
    private double priceItem5;
    private String addItem6;
    private double priceItem6;

    public void addHamburgerItem5(String addItem5, double priceItem5)
    {
        this.addItem5 = addItem5;
        this.priceItem5 = priceItem5;
    }

    public void addHamburgerItem6(String addItem6, double priceItem6)
    {
        this.addItem6 = addItem6;
        this.priceItem6 = priceItem6;
    }

    @Override
    public double TotalHamburger() {
        double HealthyPrice = super.TotalHamburger();
        if (addItem5!=null)
        {
            System.out.println("Item " + addItem5 + "added of price " + priceItem5);
            HealthyPrice += priceItem5;
        }
        if (addItem6!=null)
        {
            System.out.println("Item " + addItem6 + "added of price " + priceItem6);
            HealthyPrice +=priceItem6;
        }
        return HealthyPrice;
    }
}
