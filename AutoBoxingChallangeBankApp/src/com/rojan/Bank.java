package com.rojan;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private ArrayList<Branches> bankBrances = new ArrayList<Branches>();
    private Scanner scanner = new Scanner(System.in);
    public boolean addBranches(Branches branch){
        if (findBranch(branch.getBranchName())>=0){
            System.out.println("Branch Already Exists!");
            return false;
        }
        bankBrances.add(branch);
        return true;
    }
    public boolean addCustomer(String Bname,Customer customer){
        if (getCustomer(customer)>=0) {                             //Checks whether the customer exists i.e it gets returned
            System.out.println("Customer Already Exists!");
            return false;
        }
        int position = findBranch(Bname);                       // the index of the customer and -1 if not
        Branches branch = bankBrances.get(position);
        branch.addCustomer(customer);
        return true;
    }

    private int getCustomer(Customer customer){
        return bankBrances.indexOf(customer);           //Returns the position of the customer in the arraylist
    }

    public int findBranch(String name){                 //Search the array list for branch name and return the position
        for (int i=0; i<bankBrances.size();i++) {       // if found returns the position of branch position in list
            Branches branch = bankBrances.get(i);
            if (branch.getBranchName().equals(name)) {
                return i;
            }
        }
            return -1;
    }

    public boolean ShowBranchCustomer(String name){
        int position = findBranch(name);
        if (position>=0){
            Branches branch = bankBrances.get(position);            // Gets the branch info of the position to "branch" object
            branch.ShowCustomer();
            return true;
        }
        System.out.println("Branch Not Found!");
        return false;
    }
    public void showBranches(){
        if (this.bankBrances.size()==0){
            System.out.println("No data found!");
        }
        for (int i=0;i<this.bankBrances.size();i++){
            Branches branches = bankBrances.get(i);
            System.out.println((i+1) +" Branch: " + branches.getBranchName());
        }
    }

    public boolean addTrans(String Cname,String Bname){
        Branches branches = bankBrances.get(findBranch(Bname));
        if (branches.findCustomer(Cname)>=0){
            System.out.println("Enter the transaction amount!");
            Double trnas = scanner.nextDouble();
            if (branches.Transactions(Cname, trnas)){
                System.out.println("Transaction Successful!");
                return true;
            }
        }
        System.out.println("Customer Not Found!");
        return false;
    }
    public void showCustomers(){
        if (bankBrances.size()==0){
            System.out.println("No bank Branches and Customer found!");
        }
        for (int i=0;i<this.bankBrances.size();i++){
            Branches branches = bankBrances.get(i);
            System.out.println("Branch: " + branches.getBranchName());
            branches.ShowCustomer();
        }
    }






}
