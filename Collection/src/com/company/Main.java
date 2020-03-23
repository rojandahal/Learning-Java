package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    Theatre theatre = new Theatre("Himalayan Talkies",8,10);
    List<Theatre.Seat> seatsCopy = new ArrayList<>(theatre.seats);
    printList(seatsCopy);
        Collections.reverse(seatsCopy);
        System.out.println("Reversed seats copy");
        printList(seatsCopy);
        Collections.shuffle(seatsCopy);
        System.out.println("Shuffled seats");
        printList(seatsCopy);

        Theatre.Seat minSeat = Collections.min(seatsCopy);
        Theatre.Seat maxSeat = Collections.max(seatsCopy);
        System.out.println("Minimum and maximum elements are:");
        System.out.println(minSeat.getSeatNumber() + " " + maxSeat.getSeatNumber());

        System.out.println("Sorted Array");
        Collections.sort(seatsCopy);
        printList(seatsCopy);




    }
    public static void printList(List<Theatre.Seat> list)
    {
        for(Theatre.Seat seat : list)
        {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println("");
        System.out.println("=====================================================================");
    }
}
