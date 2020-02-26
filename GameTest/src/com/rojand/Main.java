package com.rojand;
import com.example.game.*;
//either the upper code or the below import but below one is Better as it specifies each method to import
//import com.example.game.ISaveable;
//import com.example.game.Monster;
//import com.example.game.Player;

public class Main {

    public static void main(String[] args) {
	    Player Rojan = new Player("Rojan",100,50);
	    saveObject(Rojan);

        System.out.println(Rojan);
	    Rojan.setHitpoints(200);
	    Rojan.setWeapon("Sword");

	    ISaveable fire = new Monster("Ragnarok",300,50);
        System.out.println(((Monster) fire).getHitPoints());
        System.out.println(fire);
    }
    public static void saveObject(ISaveable saved){
        for (int i=0;i<saved.write().size();i++)
        {
            System.out.println("Saving " + saved.write().get(i) + " to storage");
        }
    }

}
