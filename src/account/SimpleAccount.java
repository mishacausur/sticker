package account;

public class SimpleAccount extends Account {
    @Override
    public boolean add(long amount) {
        this.amount += amount;
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (this.getBalance() >= amount) {
            this.amount -= amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean transfer(Account account, long amount) {
        if (this.getBalance() >= amount) {
            account.add(amount);
            pay(amount);
            return true;
        }
        return false;
    }
}
