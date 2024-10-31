package deal;

public class Sale extends Deal {
    private static final String COMMENT = "Продажа %s на %d руб.";
    String name;

    public Sale(String name, int debitChange) {
        super(String.format(COMMENT, name, debitChange), debitChange, 0);
        this.name = name;
    }
}
