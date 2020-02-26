package com.example.game;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int HitPoints;
    private int Strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        HitPoints = hitPoints;
        Strength = strength;
    }

    public String getName() {
        return name;
    }


    public int getHitPoints() {
        return HitPoints;
    }


    public int getStrength() {
        return Strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitPoints(int hitPoints) {
        HitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", HitPoints=" + HitPoints +
                ", Strength=" + Strength +
                '}';
    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<>();
        values.add(0,name);
        values.add(1,""+HitPoints);
        values.add(2,""+ Strength);

        return values;
    }

    @Override
    public void readValues(List<String> value) {
            if (value!=null && value.size()>0)
            {
                this.name=value.get(0);
                this.HitPoints=Integer.parseInt(value.get(1));
                this.Strength=Integer.parseInt(value.get(2));
            }
    }
}
