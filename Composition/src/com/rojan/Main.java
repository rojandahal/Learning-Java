package com.rojan;

public class Main {

    public static void main(String[] args) {

        Handle theHandle = new Handle();
        Door door = new Door(theHandle,"Kick");
        PowerSupply pSupply = new PowerSupply();
        Television theTV = new Television("Samsung B30",pSupply);
        Lock theLock = new Lock();
        Window theWindow = new Window(2,20,30,15,theLock);
        Room room = new Room(door,theTV,theWindow);

        room.EnterRoom();
        room.getTheTV().powerUP();
        room.OpenWindow();

    }
}
