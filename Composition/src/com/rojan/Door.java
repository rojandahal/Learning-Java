package com.rojan;

public class Door {
    private Handle handle;
    private String action;

    public Door( Handle handle,String action) {
        this.action = action;
        this.handle = handle;
    }

    public void OpenDoor()
    {
        handle.HandleAction(action);
        this.action = action;
        System.out.println("The door is opened by: : " + this.action);
    }

    public Handle getHandle() {
        return handle;
    }

    public String getAction() {
        return action;
    }
}
