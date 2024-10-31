package taxes;
import static java.lang.Math.*;

public class RegularTaxSystem extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int i = debit * 6 / 100;
        return max(0, i);
    }
}
