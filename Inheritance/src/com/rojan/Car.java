package com.rojan;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gear;
    private boolean isManuel;

    public Car(String name, String size, int wheels, int doors, int gear, boolean isManuel) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gear = gear;
        this.isManuel = isManuel;
    }
    public void changeGear(int gear)
    {
        this.gear = gear;
        System.out.println("\n" + "Gear Change Successful to: " + gear + "\n");
    }
    public void changeVelocity(int speed, int direct){
        move(speed,direct);
    }
}
