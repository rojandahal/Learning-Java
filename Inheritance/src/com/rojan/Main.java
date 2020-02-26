package com.rojan;

public class Main {

    public static void main(String[] args) {
        Porshe porshe = new Porshe(30000);
        porshe.steer(45);
        porshe.accelerate(0);
        porshe.accelerate(30);
        porshe.accelerate(-33);
        System.out.println("\n"+"Tax: " + porshe.getTax());
    }
}
