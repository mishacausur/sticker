package deal;

public class Deal {
    String comment;
    protected int debitChange;
    protected int creditChange;

    public Deal(String comment, int debitChange, int creditChange) {
        this.comment = comment;
        this.debitChange = debitChange;
        this.creditChange = creditChange;
    }

    public int getDebit() {
        return debitChange;
    }

    public int getCredit() {
        return creditChange;
    }
}
