package com.rojan;

public class Room {
    private Door door;
    private Television theTV;
    private Window theWindow;

    public Room(Door door, Television theTV, Window theWindow) {
        this.door = door;
        this.theTV = theTV;
        this.theWindow = theWindow;
    }

    public void EnterRoom()
    {
        door.OpenDoor();

    }

    public Television getTheTV() {
        return theTV;
    }

    public void OpenWindow() {
        theWindow.OpenWindow();
    }
}
