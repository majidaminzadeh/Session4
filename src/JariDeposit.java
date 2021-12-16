import deposit.Deposit;

public class JariDeposit extends Deposit {
    private final String title = "سپرده جاری";

    public JariDeposit(String depositNo, String customerName){
        super(depositNo, customerName);
    }

    void showBalance(){
        System.out.println("مانده " + title + " با شماره سپرده " + getDepositNumber() + " " + getBalance());
    }
}
