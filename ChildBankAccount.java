public class ChildBankAccount {
    private double balance;
    private final double maxBalance;

    public double getBalance() {
        return balance;
    }

    public ChildBankAccount(double maxBalance) {
        this.maxBalance = (maxBalance > 0) ? maxBalance : 0;
    }

    public boolean depositMoney(double value) {
        if (value < 0) {
            return false;
        }
        if (balance + value <= maxBalance) {
            balance += value;
        }
        return false;
    }

    public boolean debitMoney(double value) {
        if (value < 0) {
            return false;
        }
        if (balance - value < 0) {
            return false;
        }
        balance -= value;
        return true;
    }

}











