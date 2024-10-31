package deal;

public class Expenditure extends Deal {
    private static final String COMMENT = "Покупка %s на %d руб.";
    String name;

    public Expenditure(String name, int creditChange) {
        super(String.format(COMMENT, name, creditChange), 0, creditChange);
        this.name = name;
    }
}
