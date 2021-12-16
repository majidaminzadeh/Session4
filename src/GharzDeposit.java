import deposit.Deposit;

public class GharzDeposit extends Deposit {
    private final String title = "سپرده قرض الحسنه";

    public GharzDeposit(String depositNo, String customerName){
        // My Parent constructor called
        // then My constructor called
        super(depositNo, customerName);
        System.out.println("GhazrDeposit called");
    }

    void showBalance(){
        System.out.println("مانده " + title + " با شماره سپرده " + getDepositNumber() + " " + getBalance());    }
}
