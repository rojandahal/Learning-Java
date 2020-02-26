package com.rojan;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static int ch;
    private static Bank bank = new Bank();
    public static void main(String[] args) {
	     boolean choice = true;
	     information();
	     while (choice){
             System.out.println("Enter your choice: ");
             ch = scanner.nextInt();
             switch(ch){
                 case 0:
                     information();
                     break;
                 case 1:
                     addCustomer();
                     break;
                 case 2:
                     addTransaction();
                     break;
                 case 3:
                     addBranch();
                     break;
                 case 4:
                     showBranchCustomer();
                     break;
                 case 5:
                     showBranches();
                     break;
                 case 6:
                     showCustomers();
                     break;
                 case 7:
                     choice = false;
                     break;
                 default:
                     System.out.println("Invalid Choice!");
             }

         }
    }

    public static void information(){
        System.out.println("0.Information");
        System.out.println("1.Add Customer and Initial Transaction.");
        System.out.println("2.Add transaction to a customer.");
        System.out.println("3.Add a branch.");
        System.out.println("4.Show customer for a branch.");
        System.out.println("5.Show all branch.");
        System.out.println("6.Show all customer.");
        System.out.println("7.Exit");
    }
    public static void addCustomer(){
        System.out.println("Enter branch name: ");
        scanner.nextLine();                                             //To clear buffer
        String Bname = scanner.nextLine();
        if (bank.findBranch(Bname)>=0) {                //Check whether bank exists or not
            System.out.print("Enter customer name: ");
            String name = scanner.nextLine();
            System.out.print("Enter initial transaction amount: ");
            double trans = scanner.nextDouble();
            Customer customer = Customer.createCustomer(trans,name);        //Static function creates new customer
            bank.addCustomer(Bname,customer);                           //Adds the customer to the branch
            return;
        }
        System.out.println("Branch Not Found!");
    }

    public static void addTransaction(){
        System.out.println("Enter branch name of customer!");
        scanner.nextLine();
        String Bname = scanner.nextLine();
        if (bank.findBranch(Bname)>=0){                     //Search branch exists or not and return -1 if not and >=0 if yes
            System.out.println("Enter the customer name!");
            String CName = scanner.nextLine();
            if (bank.addTrans(CName, Bname)){
                return;                                 //so that the process ends after adding the transaction
            }
            return;                                     //so that process ends after the customer if not found
        }
        System.out.println("Branch Doesn't Exist");
    }

    public static void addBranch(){
        System.out.println("Enter Branch Name!");
        scanner.nextLine();
        String bName = scanner.nextLine();
        Branches branches = new Branches(bName);
        if (bank.addBranches(branches)){
            System.out.println("Branch Added Successfully!");
            return;
        }
        System.out.println("Branch Adding Failed!");
    }

    public static void showBranchCustomer(){
        System.out.println("Enter branch Name!");
        scanner.nextLine();
        String Bname = scanner.nextLine();
        if (bank.ShowBranchCustomer(Bname)){
            System.out.println("These are the Branches Customer!");
            return;
        }
    }
    public static void showBranches(){
        bank.showBranches();
    }
    public static void showCustomers()
    {
        bank.showCustomers();
    }









}
