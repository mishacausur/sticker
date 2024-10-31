import taxes.DebitMinusCreditTaxSystem;

public class Main {

    public static void main(String[] args) {
        Company adidas = new Company("Adidas", new DebitMinusCreditTaxSystem());
        adidas.shiftMoney(100);
        adidas.shiftMoney(-50);
        adidas.payTaxes();
    }
}

