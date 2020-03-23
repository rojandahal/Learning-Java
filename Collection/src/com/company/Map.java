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
        System.out.println(languages.put("Java", "I am learning java"));  // This will overwrite the Value for Java key but prints the
        // previous value and when we print it again the new value gets printed
        System.out.println(languages.get("Java"));  //This will print the overwritten value

        //These lines below are used to check whether a key is present or not, when the key is present then it is checked by
        //languages.containsKey()
        if (languages.containsKey("Kotlin")){
            System.out.println("Kotlin is already present");
        }else
            languages.put("Kotlin", "Kotlin is love");
        System.out.println(languages.get("Kotlin"));

        System.out.println("==============================================================");
        //This languages.keySet() returns the sets of key of the maps and when we loop through all of them which prints the key and
        //the values of the keys
        for(String key: languages.keySet())
        {
            System.out.println(key + " : " + languages.get(key));
        }



    }
}
