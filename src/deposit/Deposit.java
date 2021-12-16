package deposit;

public class Deposit {
    private String depositNumber = "";
    private String customer;
    private int balance;

    public Deposit(String depositNumber, String customer){
        System.out.println("deposit.Deposit 2nd constructor called");
        this.depositNumber = depositNumber;
        this.customer = customer;
    }

    public Deposit(){
        System.out.println("deposit.Deposit called");
    }

    void defray(int defrayBalance){
        this.balance += defrayBalance; // balance = balance + defrayBalance;
    }

    void withdrawal(int withdrawalBalance){
        this.balance -= withdrawalBalance; // balance  = balance - withdrawalBalance
    }

    void setDepositNumber(String depositNumber){
        this.depositNumber = depositNumber;
    }

    protected String getDepositNumber(){
        return this.depositNumber;
    }

    String getCustomer(){
        return this.customer;
    }

    void setCustomer(String customer){
        this.customer = customer;
    }

    protected int getBalance(){
        return this.balance;
    }

    void setBalance(int balance){
        this.balance = balance;
    }
}
