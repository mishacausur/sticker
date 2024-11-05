package account;

public class CreditAccount extends Account {
    protected long creditLimit;

    public CreditAccount(long creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean add(long amount) {
        if ((getBalance() + amount) < 0) {
            this.amount += amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean pay(long amount) {
        if (creditLimit > Math.abs(this.amount - amount)) {
            this.amount -= amount;
            return true;
        }
        return false;
    }

    @Override
    public long getBalance() {
        return creditLimit + amount;
    }

    @Override
    public boolean transfer(Account account, long amount) {
        if (creditLimit > Math.abs(this.amount - amount)) {
            account.add(amount);
            pay(amount);
            return true;
        }
        return false;
    }
}
