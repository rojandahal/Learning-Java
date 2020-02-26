package com.rojan;

import java.util.ArrayList;

public class Branches {
    private String BranchName;
    private ArrayList<Customer> Bankcustomers = new ArrayList<Customer>();

    public Branches(String branchName) {
        BranchName = branchName;
    }

    public String getBranchName() {
        return BranchName;
    }

    public boolean addCustomer(Customer customers){
        if (findCustomer(customers.getName())>=0){
            System.out.println("Customer Already Exists!");
            return false;
        }
        Bankcustomers.add(customers);
        return true;
    }
    public boolean Transactions (String Cname,Double transaction){
        if (findCustomer(Cname)>=0){
            Customer customer = Bankcustomers.get(findCustomer(Cname));
            customer.setTransaction(customer.getTransaction()+transaction);     //adds the amount to the customer transaction money
            return true;
        }
        return false;
    }

    public int findCustomer(String name) {
        for (int i = 0; i < this.Bankcustomers.size(); i++) {
            Customer customer = Bankcustomers.get(i);
            if (customer.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void ShowCustomer(){
        if (this.Bankcustomers.size()==0){
            System.out.println("No data Available!");
        }
        System.out.println("Name " + "\t\t\tTransaction");
        for (int i=0; i< this.Bankcustomers.size();i++){
            Customer customer = this.Bankcustomers.get(i);
            System.out.println(customer.getName() + "\t\t" + customer.getTransaction());
        }
    }


}
