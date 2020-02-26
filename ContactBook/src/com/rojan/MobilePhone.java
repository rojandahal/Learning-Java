package com.rojan;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;              //Creating new array list of type Contact class

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addContact(Contact contact)
    {
        if (findContact(contact.getContactName()) >= 0){            //Search according to name
            System.out.println("Item already exists.\n");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean modifyContact(Contact oldContact,Contact newContact){
        int position = findContact(oldContact);                     //position of the item which is the Contact object
        if (position<0) {                                          //Returns -1 is not found and +ve position
            System.out.println("Contact Doesn't exist.");           //if found
            return false;
        }else if (findContact(newContact)!=-1){
            System.out.println("The Contact already exists!. Update unsuccessful");
        }
        this.myContacts.set(position,newContact);
        return true;
    }
    public boolean removeContact(Contact contact){
        int position = findContact(contact);
        if (position<0){
            System.out.println("Contact not found");
            return false;
        }
        this.myContacts.remove(position);
        return true;
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if (position>=0 ){
            return this.myContacts.get(position);
        }
        return null;
    }

    private int findContact(Contact contact){                       //It returns the position of the contact item passed to it
        return myContacts.indexOf(contact);
    }

    private int findContact(String name){
        for (int i=0;i<this.myContacts.size() ; i++){
            Contact contact = myContacts.get(i);                    // .get(i) gets the object which is item to the
            if (contact.getContactName().equals(name)) {               //array list and stores to contact
                return i;
            }
        }
        return -1;
    }


    public void printContact(){
        if (this.myContacts.size()==0){
            System.out.println("No Contact Found!");
            return;
        }
        System.out.println("Name" + "\t\t\t Number");
        for (int i=0; i<this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            System.out.println((i+1) + ". " +  contact.getContactName() + "\t\t\t" + contact.getNumber());
        }
    }




}
