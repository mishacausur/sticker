package account;

public abstract class Account {
    protected long amount;
    abstract boolean add(long amount);

    abstract boolean pay(long amount);

   abstract  public boolean transfer(Account account, long amount);

    public long getBalance() {
        return amount;
    }
}
