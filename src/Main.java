import deal.Deal;
import deal.Expenditure;
import deal.Sale;
import taxes.*;

public class Main {

    public static void main(String[] args) {
        checkTask1();
        checkTask2();
    }

    public static void checkTask1() {
        Company adidas = new Company("Adidas", new DebitMinusCreditTaxSystem());
        adidas.shiftMoney(100);
        adidas.shiftMoney(-50);
        adidas.payTaxes();

        adidas.shiftMoney(1000);
        adidas.payTaxes();

        adidas.setTaxSystem(new RegularTaxSystem());
        adidas.shiftMoney(100);
        adidas.payTaxes();
    }

    public static void checkTask2() {
        Company nike = new Company("NIKE", new RegularTaxSystem());
        Deal[] deals = {
            new Sale("AirForce", 300),
                new Expenditure("Xemore", 400),
        };
        nike.shiftMoney(1000);
        System.out.println(nike.applyDeals(deals));
    }
}

