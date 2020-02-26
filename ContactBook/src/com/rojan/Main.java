package com.rojan;

import java.util.Scanner;

public class Main {

    private static boolean exit=true;
    private static Scanner scan = new Scanner(System.in);
    private static MobilePhone mobile = new MobilePhone("9812301261");
    public static void main(String[] args) {
        int choice;
        System.out.println("Turning on phone..........");
        GetInfo();
        while(exit)
        {
            System.out.println("Enter your Choice: ");
            choice = scan.nextInt();
            scan.nextLine();
            switch(choice){
                case 0:
                    GetInfo();
                    break;
                case 1:
                    addContact();
                    break;
                case 2:
                    modifyContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    searchContact();
                    break;
                case 5:
                    printContact();
                    break;
                case 6:
                    exit = false;
                    System.out.println("Switching off phone.......");
                    break;
                default:
                    System.out.println("Invalid Choice");

            }
        }
    }

    public static void GetInfo(){
        System.out.println("0. To get Information.");
        System.out.println("1. To add new Contact.");
        System.out.println("2. To modify Contact.");
        System.out.println("3. To delete Contact.");
        System.out.println("4. To search Contact.");
        System.out.println("5. To display Contact List.");
        System.out.println("6. To exit");
    }
    public static void addContact()
    {
        System.out.print("Enter name of contact: ");
        String name = scan.nextLine();
        System.out.print("Enter phone number: ");
        String number = scan.nextLine();
        Contact contact = Contact.createContact(name,number);
        if(mobile.addContact(contact)){
            System.out.println("Contact added.");
        }
        else{
            System.out.println("Name already Exists.");
        }
    }

    public static void modifyContact()
    {
        System.out.println("Enter contact name to modify.");
        String name = scan.nextLine();
        if (mobile.queryContact(name)==null){
            System.out.println("Contact Not Found!");
            return;
        }
        Contact oldContact = mobile.queryContact(name);
        System.out.println("Enter new name to modify: ");
        name = scan.nextLine();
        System.out.println("Enter new phone number: ");
        String num = scan.nextLine();
        Contact newContact = Contact.createContact(name,num);
        if (mobile.modifyContact(oldContact,newContact)){
            System.out.println("Contact Updated Successfully.");
            return;
        }
        System.out.println("Contact Update Failed!");
    }

    public static void removeContact(){
        System.out.println("Enter a name to remove.");
        String name = scan.nextLine();
        if(mobile.queryContact(name)==null){
            System.out.println("Contact not found!.");
        }
        Contact contact = mobile.queryContact(name);
        mobile.removeContact(contact);
        System.out.println("Contact Removed Successfully!");
    }
    public static void searchContact(){
        System.out.println("Enter name to search.");
        String name = scan.nextLine();
        if (mobile.queryContact(name)==null){
            System.out.println("Contact Not Found!");
            return;
        }
        Contact contact = mobile.queryContact(name);
        System.out.println("Contact Found!");
        System.out.println("Name: "+ contact.getContactName() + " Number: " + contact.getNumber());
    }

    public static void printContact(){
        mobile.printContact();
    }








}
