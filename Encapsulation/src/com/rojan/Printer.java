package com.rojan;

public class Printer {
    private int TonerLevel;
    private int PagesPrinted;
    private String type;

    public Printer(int tonerLevel, String type) {
        if (tonerLevel>0 && tonerLevel<100) {
            TonerLevel = tonerLevel;
        }else TonerLevel=0;
        PagesPrinted = 0;
        this.type = type;
    }
    public void addToner(int toner)
    {
        this.TonerLevel = TonerLevel + toner;
        if (TonerLevel>100)
            TonerLevel=100;

        System.out.println("Toner Level Increased to : " + this.TonerLevel);

    }
    public void PrintingPages(int page)
    {
        PagesPrinted = PagesPrinted + page;
        System.out.println("Total pages printed: " + PagesPrinted);
    }
}
