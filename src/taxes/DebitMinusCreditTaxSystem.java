package taxes;
import static java.lang.Math.*;

public class DebitMinusCreditTaxSystem extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int i = (debit - credit) * 15 / 100;
        return max(0, i);
    }
}
