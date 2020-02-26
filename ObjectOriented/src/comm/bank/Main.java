package comm.bank;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Account account = new Account();
        Scanner get = new Scanner(System.in);
        int AccNo,Bal,Phone;
        String Name,Email;

        System.out.println("Enter the values for AccountNum: ");
        AccNo = get.nextInt();
        account.setAccNO(AccNo);

        System.out.println("Enter the value for Balance: ");
        Bal = get.nextInt();
        account.setBalance(Bal);

        System.out.println("Enter the value for Customer Name: ");
        Name = get.next();
        account.setCustomerName(Name);

        System.out.println("Enter the value for Email: ");
        Email = get.next();
        account.setEmail(Email);

        System.out.println("Enter the value for Phone Number: ");
        Phone = get.nextInt();
        account.setPhoneNo(Phone);

        System.out.println("Enter the amount to add? ");
        int add = get.nextInt();
        account.depositFund(add);

        System.out.println("Enter the amount to Withdraw? ");
        int withD = get.nextInt();
        account.withdrawFund(withD);

        System.out.println("Details of Customer One: " + "\n" +
                account.getAccNO() + "\n" +
                account.getCustomerName() + "\n" +
                account.getEmail() + "\n" +
                account.getBalance() + "\n" +
                account.getPhoneNo() + "\n");


        Account bobaccount = new Account(323,2000, "BOB Marley", "Mapnye",
                986);
        System.out.println("Details of Customer Two: " + "\n" +
                account.getAccNO() + "\n" +
                account.getCustomerName() + "\n" +
                account.getEmail() + "\n" +
                account.getBalance() + "\n" +
                account.getPhoneNo());
    }
}
