package com.rojan;

import java.awt.print.Book;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class SOrtingAlphabet {
    public static void main(String[] args) {
        LinkedList<String> BooksName = new LinkedList<String>();
        addItem(BooksName,"Chemistry");
        addItem(BooksName,"Network Theory");
        addItem(BooksName,"EDC");
        addItem(BooksName,"DSA");
        addItem(BooksName,"Physics");
        addItem(BooksName,"Maths");
        addItem(BooksName,"Logic");

        printlinkedlist(BooksName);

        addItem(BooksName,"Logic");
        printlinkedlist(BooksName);


    }

    private static void printlinkedlist (LinkedList < String > bookname) {
        Iterator<String> i = bookname.iterator();
        while (i.hasNext()) {
            System.out.println("Book Name: " + i.next());
        }
        System.out.println("===========================");
    }


    private static boolean addItem(LinkedList<String> addbook, String newBook){
        ListIterator<String> stringListIterator = addbook.listIterator();
        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newBook);
            if (comparison ==0){
                System.out.println(newBook + " is already in the list.");
                return false;
            }
            else if (comparison > 0) {
                //add item to the previous item place as it is alphabetically greater
                stringListIterator.previous();
                stringListIterator.add(newBook);
                return true;
            }else if (comparison < 0){
                //The item is not alphabetically greater than the first item so
                //move to next item
            }
        }
        addbook.add(newBook);
        return true;
    }


}
