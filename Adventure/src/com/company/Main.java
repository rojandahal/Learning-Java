package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static Map<Integer,Locations> locations = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This will put locations to different location ID and their description
        //It will have a entry and a description
        locations.put(0,new Locations(0,"You are sitting in front of your computer learning Java"));
        locations.put(1,new Locations(1,"You are inFront of your house in the road"));
        locations.put(2,new Locations(2,"You are up in the hill"));
        locations.put(3,new Locations(3,"You are inside the building"));
        locations.put(4,new Locations(4,"You are in the valley"));
        locations.put(5,new Locations(5,"You are in the forest"));

        //Adding exists means the location to have some fixed values to move forward to
        locations.get(1).addExits("E",3);
        locations.get(1).addExits("W",2);
        locations.get(1).addExits("N",5);
        locations.get(1).addExits("S",4);

        locations.get(2).addExits("N",5);

        locations.get(3).addExits("W",1);

        locations.get(4).addExits("W",2);
        locations.get(4).addExits("N",1);

        locations.get(5).addExits("W",2);
        locations.get(5).addExits("S",1);

        //This will make another map with key values as the direction and the values as the letters fo the direction
        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("EAST","E");
        vocabulary.put("WEST","W");
        vocabulary.put("NORTH","N");
        vocabulary.put("SOUTH","S");
        vocabulary.put("QUIT","Q");

        int loc=1;
        while(true){
            System.out.println(locations.get(loc).getDescription());
            if(loc==0){
                break;
            }
               Map<String, Integer> exists = locations.get(loc).getExits();
            System.out.println("Available exists are:");
            for (String exit: exists.keySet())
            {
                System.out.print(exit + ",");
            }
            System.out.println();
            String direction = scanner.nextLine().toUpperCase();
        //This line below will be executed until the length of the sentence or word is 1
            //If we type a "go south" sentence then first it checks the "GO" and then "SOUTH" from line 63 where the sentence is split
            if(direction.length()>1){
                String[] words = direction.split(" ");  //This splits the sentence into words
                for(String word :  words) {         //Loop until all the word from 'words' array is completed
                    if (vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }
            //If the exit contains the key i.e the key is the value from the vocabulary map i.e E,W,N,S
            //and it checks for the single letters too as the single letters don't go in if case from line 62
            if(exists.containsKey(direction)){
                loc=exists.get(direction);
            }else
                System.out.println("You cannot go to that direction");
        }
    }
}
