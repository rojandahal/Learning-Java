package com.example.awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
//Doing above import and java.awt.event*; is valid but java.awt*; not valid because .event is different from just awt
//import java.awt.event.*;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {

    /*The paint when overridden we can declare font and drawString in the window it is also overridden from package java.awt.*/
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif",Font.BOLD,18);
        Font sansSerifSmall = new Font("SansSerif",Font.BOLD,12);
        g.setFont(sansSerifLarge);
        g.drawString("The complete Java Developer Course",60,60);
        g.setFont(sansSerifSmall);
        g.drawString("done by Rojan Dahal",60,100);
    }

    public MyWindow(String title)       // The title here means the title of the Window that we are creating this is also overridden from java.awt.*
    {
        super(title);
        setSize(500,200);          // Makes Window Size of height 140 and width 500
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {  //Window closed is called when window is closed and
                System.exit(0);         // Window closing is used when window is closing
            /* Here System.exit(0) means if we click the X in window it exits the window which doesn't happen automatically */
            }
        });


    }
}
