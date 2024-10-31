package deal;

public class Deal {
    String comment;
    public int debitChange;
    public int creditChange;

    public Deal(String comment, int debitChange, int creditChange) {
        this.comment = comment;
        this.debitChange = debitChange;
        this.creditChange = creditChange;
    }
}
