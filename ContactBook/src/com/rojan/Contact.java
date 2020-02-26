package com.rojan;

public class Contact {
    private String ContactName;
    private String Number;

    private Contact(String contactName, String number) {
        ContactName = contactName;
        Number = number;
    }

    public String getContactName() {
        return ContactName;
    }

    public String getNumber() {
        return Number;
    }
    public static Contact createContact(String ContactName, String  number)
    {
        return new Contact(ContactName,number);
    }
}
