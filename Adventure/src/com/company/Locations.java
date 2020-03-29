package com.company;

import java.util.HashMap;
import java.util.Map;

public class Locations {
    private final int LocationID;
    private final String description;
    private final Map<String,Integer> exits;

    public Locations(int locationID, String description,Map<String,Integer> exists) {
        LocationID = locationID;
        this.description = description;
        //Adding this.exits=exists; can make the key change the original value so that new HashMap<>(exists) will save a copy of it
        this.exits = new HashMap<String,Integer>(exists);
        this.exits.put("Q",0);
    }

    public int getLocationID() {
        return LocationID;
    }

    public String getDescription() {
        return description;
    }

    //This is done so that a new hash map is returned for exists so that the real exits value is not changed from the main
    public Map<String, Integer> getExits() {
        return new HashMap<String,Integer>(exits);
    }
}
