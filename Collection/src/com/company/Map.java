package com.company;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        java.util.Map<String,String> languages = new HashMap<>();
        //This line can be Map<String, String> languages but We need to change the class name from Map to any other things

        languages.put("Java", "A compiled high level object oriented platform independent language");
        languages.put("Python", "An interpreted object oriented high level objected oriented language");
        languages.put("Algol", "Algorithmic language");
        languages.put("BASIC","Beginners All purpose symbolic instruction code");

        System.out.println(languages.get("Java"));


    }
}
