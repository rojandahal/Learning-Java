package com.rojan;

public class Television {
    private PowerSupply supply;
    private String model;

    public Television(String model,PowerSupply supply) {
        this.supply = supply;
        this.model = model;
    }

    public void powerUP()
    {
        supply.Power();
        DisplayPixel(2,4, "Yellow");
    }
    private void DisplayPixel(int x, int y, String color)
    {
        System.out.println("\nPixel Display at:" + x + " " + y + " in color: " + color );
    }

    public PowerSupply getSupply() {
        return supply;
    }

}