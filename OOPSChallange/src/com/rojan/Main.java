package com.rojan;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Normal",200,"Chicken","Brown Bread");
        hamburger.addHamburgerItem1("Tomato",5);
        hamburger.addHamburgerItem2("Onion",7);
        hamburger.addHamburgerItem3("Ketchup",3.77);
        hamburger.addHamburgerItem4("Carrot",5.67);
        System.out.println("Total Burger Price: " + hamburger.TotalHamburger());

        HealthyBurger healthyBurger = new HealthyBurger(333,"Buff");
        healthyBurger.addHamburgerItem5("Beans",3.55);
        healthyBurger.addHamburgerItem6("Pista",12.23);
        System.out.println("Total Burger Price: " + healthyBurger.TotalHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerItem1("This is not Cool",44);
        deluxeBurger.TotalHamburger();



    }
}
