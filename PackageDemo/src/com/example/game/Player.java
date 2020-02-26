package com.example.game;

import java.util.*;

public class Player implements ISaveable {
    private String name;
    private int Hitpoints;
    private int Strength;
    private String Weapon;

    public Player(String name, int hitpoints, int strength) {
        this.name = name;
        Hitpoints = hitpoints;
        Strength = strength;
        Weapon = "Gun";
    }

    public String getName() {
        return name;
    }


    public int getHitpoints() {
        return Hitpoints;
    }

    public int getStrength() {
        return Strength;
    }


    public String getWeapon() {
        return Weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitpoints(int hitpoints) {
        Hitpoints = hitpoints;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    public void setWeapon(String weapon) {
        Weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", Hitpoints=" + Hitpoints +
                ", Strength='" + Strength + '\'' +
                ", Weapon='" + Weapon + '\'' +
                '}';
    }

    @Override
    public void readValues(List<String> value) {
        if(value!=null && value.size()>0){
            this.name= value.get(0);
            this.Strength=Integer.parseInt(value.get(1));
            this.Hitpoints=Integer.parseInt(value.get(2));
            this.Weapon=value.get(3);
        }

    }

    @Override
    public List<String> write() {
        List<String> newvalue = new ArrayList<>();
        newvalue.add(0,name);
        newvalue.add(1,"" + this.Strength);
        newvalue.add(2,""+ this.Hitpoints);
        newvalue.add(3,Weapon);
                return newvalue;
    }
}
