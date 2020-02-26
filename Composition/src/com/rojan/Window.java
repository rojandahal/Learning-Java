package com.rojan;

public class Window {
    private int number;
    private int breadth, height, length;

    public Window(int number, int breadth, int height, int length, Lock lock) {
        this.number = number;
        this.breadth = breadth;
        this.height = height;
        this.length = length;
        this.lock = lock;
    }

    private Lock lock;
    public void OpenWindow()
    {
        lock.OpenLock();
        WindowDimension();
    }
    private void WindowDimension()
    {
        System.out.println("\n" + number + " Window of Length: " +length +" Breadth: " + breadth
        + " Height:  " + height + " Opened");
    }

    public int getNumber() {
        return number;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public Lock getLock() {
        return lock;
    }
}
