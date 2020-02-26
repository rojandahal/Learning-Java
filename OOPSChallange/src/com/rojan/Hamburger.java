package com.rojan;

public class Hamburger {
    private String name;
    private double price;
    private String meat;
    private String breadRollType;

    public Hamburger(String name, double price, String meat, String breadRollType) {
        this.name = name;
        this.price = price;
        this.meat = meat;
        this.breadRollType = breadRollType;
    }

    private String addItem1;
    private String addItem2;
    private String addItem3;
    private String addItem4;

    private double priceItem1;
    private double priceItem2;
    private double priceItem3;
    private double priceItem4;

    public void addHamburgerItem1(String addItem1, double priceItem1)
    {
        this.addItem1 = addItem1;
        this.priceItem1 = priceItem1;
    }
    public void addHamburgerItem2(String addItem2, double priceItem2)
    {
        this.addItem2 = addItem2;
        this.priceItem2 = priceItem2;
    }
    public void addHamburgerItem3(String addItem3, double priceItem3)
    {
        this.addItem3 = addItem3;
        this.priceItem3 = priceItem3;
    }
    public void addHamburgerItem4(String addItem4, double priceItem4)
    {
        this.addItem4 = addItem4;
        this.priceItem4 = priceItem4;
    }

    public double TotalHamburger()
    {
        double burgerPrice = price;
        System.out.println(name + " burger on a " + breadRollType + " with " + meat + " of price " + price);

        if (addItem1 !=null) {
            System.out.println("Item " + addItem1 + " added of price " + priceItem1);
            burgerPrice +=this.priceItem1;
        }
        if (addItem2!=null) {
            System.out.println("Item " + addItem2 + " added of price " + priceItem2);
            burgerPrice +=this.priceItem2;
        }if (addItem3!=null) {
            System.out.println("Item " + addItem3 + " added of price " + priceItem3);
            burgerPrice +=this.priceItem3;
        }
        if (addItem4!=null) {
            System.out.println("Item " + addItem4 + " added of price " + priceItem4);
            burgerPrice +=this.priceItem4;
        }

        return burgerPrice;

    }
}
