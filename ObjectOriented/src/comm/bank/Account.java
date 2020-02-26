package comm.bank;

public class Account {
    private int AccNO;
    private int Balance;
    private String CustomerName;
    private String Email;
    private int PhoneNo;

    public Account (){}

    public Account(int AccNO, int Balance, String CustomerName, String Email, int PhoneNo){

        this.AccNO = AccNO;
        this.Balance = Balance;
        this.CustomerName = CustomerName;
        this.Email = Email;
        this.PhoneNo = PhoneNo;
    }

    public void setAccNO(int accNO) {
        AccNO = accNO;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPhoneNo(int phoneNo) {
        PhoneNo = phoneNo;
    }

    public int getBalance() {
        return Balance;
    }

    public int getAccNO() {
        return AccNO;
    }

    public int getPhoneNo() {
        return PhoneNo;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getEmail() {
        return Email;
    }

    public void depositFund(int fund){
        System.out.println("Balance: " + Balance);
        Balance = Balance + fund;
        System.out.println("Fund Deposited Successful. New Balance: " + Balance);
    }
    public void withdrawFund(int amt){
        System.out.println("Balance: " + Balance);
        if (amt>Balance)
            System.out.println("Insufficient Balance");
        else{
            Balance = Balance - amt;
            System.out.println("Withdrawn Successful. Your new balance is: " + Balance);
        }
    }


}
