import taxes.TaxSystem;

public class Company {
    protected String title;
    private int debit = 0;
    private int credit = 0;
    private TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
       if (amount > 0) {
           debit += amount;
       } else if (amount < 0) {
           credit += Math.abs(amount);
       }
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void payTaxes() {
        int tax = taxSystem.calcTaxFor(debit, credit);
        System.out.printf("Компания %s уплатила налог в размере: %d руб.", title, tax);
        System.out.println();
        debit = 0;
        credit = 0;
    }
}
