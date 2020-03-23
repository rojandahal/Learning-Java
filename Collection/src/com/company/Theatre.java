package com.company;

import java.util.*;

public class Theatre {
    private final String theatreName;
    public List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName,int numRows, int seatperRow) {
        this.theatreName = theatreName;
        int lastRow = 'A' + (numRows-1);
        for(char row = 'A';row<=lastRow;row++) {
            for (int seatNum = 1; seatNum <= seatperRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNum)
    {
        Seat requestedSeat = new Seat(seatNum);
        int foundSeat = Collections.binarySearch(seats,requestedSeat,null);
        if(foundSeat >=0)
        {
            return seats.get(foundSeat).reserve();
        }else{
            return false;
        }
//        for(Seat seat : seats)
//        {
//            if(seat.getSeatNumber().equals(seatNum))
//            {
//                requestedSeat = seat;
//                break;
//            }
//        }
//        if(requestedSeat==null)
//        {
//            System.out.println("No valid seat number");
//            return false;
//        }
//        return requestedSeat.reserve();
    }

    //Testing
    public void getSeat()
    {
        for(Seat seat: seats)
        {
            System.out.println(seat.getSeatNumber());
        }
    }

    public class Seat implements Comparable<Seat>
    {
        private final String seatNumber;
        private boolean reserved;
        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.seatNumber);
        }

        public boolean reserve()
        {
            if(!this.reserved)
            {
                this.reserved=true;
                System.out.println("Seat " + seatNumber + " reserved.");
                return true;
            }
            else{
                return false;
            }
        }

        public boolean cancel()
        {
            if(this.reserved){
                this.reserved=false;
                System.out.println("Seat " + seatNumber + " cancelled.");
                return true;
            }
            else{
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }

}
