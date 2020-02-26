package com.rojan;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(19,"Duplex");
        printer.addToner(30);
        printer.PrintingPages(20);
    }
}
