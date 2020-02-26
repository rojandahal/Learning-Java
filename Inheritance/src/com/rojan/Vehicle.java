package com.rojan;

public class Vehicle {
    private String name;
    private String size;
    private int direction;
    private int speed;

    public Vehicle (String name, String size){
        this.name = name;
        this.size = size;
        direction = 0;
        speed = 0;
    }
    public void changeSpeed(int speed)
    {
        this.speed = speed;
    }
    public void move(int speed, int direction){
        this.speed = speed;
        this.direction = direction;
        System.out.println("Moving At: " + speed + "\n" + "Direction: " + direction);
    }
    public void steer(int direction)
    {
        this.direction = direction;
    }
    public int getSpeed()
    {
        return speed;
    }
    public void stop()
    {
        speed=0;
    }

    public int getDirection() {
        return direction;
    }
}
