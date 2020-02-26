package com.rojan;

public class Customer {
    private Double transaction;
    private String name;

    public Customer(Double transaction, String name) {
        this.transaction = transaction;
        this.name = name;
    }

    public Double getTransaction() {
        return transaction;
    }

    public void setTransaction(Double transaction) {
        this.transaction = transaction;
    }

    public String getName() {
        return name;
    }

    public static Customer createCustomer (Double transaction, String name){
        return new Customer(transaction,name);
    }
}
