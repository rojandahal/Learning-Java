package com.rojan;

public class Porshe extends Car{
    private int tax;

    public Porshe(int tax) {
        super("Porshe", "Large", 4, 5, 5, false);
        this.tax = tax;
    }

    public int getTax() {
        return tax;
    }

    public void accelerate(int rate) {
        int newSpeed= getSpeed() + rate;
        if (newSpeed > 0) {
            if (newSpeed> 0 && newSpeed <= 10)
                changeGear(1);
            else if (newSpeed<= 20)
                changeGear(2);
            else if (newSpeed <= 50)
                changeGear(3);
            else if (newSpeed <= 60)
                changeGear(4);
            else if (newSpeed <= 70)
                changeGear(5);
            else changeGear(6);

            changeVelocity(newSpeed,getDirection());

        }else {
            stop();
            changeGear(1);
            move(getSpeed(),getDirection());
        }
    }

}
