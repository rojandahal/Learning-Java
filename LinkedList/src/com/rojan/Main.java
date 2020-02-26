package com.rojan;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> BooksName = new LinkedList<String>();
        BooksName.add("Physics");
        BooksName.add("EDC");
        BooksName.add("Network Theory");
        BooksName.add("Logic Circuit");

        printlinkedlist(BooksName);

        BooksName.add(2,"DSA");
        printlinkedlist(BooksName);

        BooksName.remove(3);
        printlinkedlist(BooksName);

        BooksName.set(0,"EEM");
        printlinkedlist(BooksName);

    }


    public static void printlinkedlist(LinkedList<String> bookname){
        Iterator<String> i = bookname.iterator();
        while(i.hasNext()){
            System.out.println("Book Name: " + i.next());
        }
        System.out.println("===========================");
    }
}
