package com.rojan;

public class Main {

    public static void main(String[] args) {
                Car porshe = new Car();
                Car holden = new Car();

                porshe.color = "Red";
                holden.color ="Green";

                porshe.setModel("Carrera");
                System.out.println("The Model is: " + porshe.getModel());
                holden.setModel("Commor");
                System.out.println("THe model is: " + holden.getModel());
            }
        }
