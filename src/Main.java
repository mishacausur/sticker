
import account.Account;
import account.CreditAccount;
import account.SimpleAccount;

public class Main {

    public static void main(String[] args) {
        checkTransferFromSimpleAccount();
    }

    public static void checkTransferFromSimpleAccount() {
        SimpleAccount simple = new SimpleAccount();
        CreditAccount credit = new CreditAccount(10000);

        simple.add(20000);
        simple.transfer(credit, 10);
        System.out.println("Баланс получателя после перевода 4К - " + credit.getBalance());
        System.out.println("Баланс отправителя после перевода 4К - " + simple.getBalance());

        credit.pay(3500);
        simple.transfer(credit, 3000);
        System.out.println("Баланс получателя после перевода 3К - " + credit.getBalance());
        System.out.println("Баланс отправителя после перевода 3К - " +simple.getBalance());
    }
    public static void checkTransferFromCreditAccount() {
        SimpleAccount simple = new SimpleAccount();
        CreditAccount credit = new CreditAccount(5000);

        credit.transfer(simple, 4000);
        System.out.println("Баланс отправителя после перевода 4К - " + credit.getBalance());
        System.out.println("Баланс получателя после перевода 4К - " + simple.getBalance());
    }

    public static void checkCreditAccount() {
        CreditAccount creditAccount = new CreditAccount(10000);
        creditAccount.add(2000);
        System.out.println("Баланс после добавления 2К - " + creditAccount.getBalance());
        creditAccount.pay(8000);
        System.out.println("Баланс после траты 8К - " + creditAccount.getBalance());
        creditAccount.pay(5000);
        System.out.println("Баланс после траты 5К - " + creditAccount.getBalance());
    }
    public static void checkSimpleAccount() {
        SimpleAccount simple = new SimpleAccount();
        simple.add(5000);
        System.out.println("Баланс после добавления 5К - " + simple.getBalance());
        simple.pay(10000);
        System.out.println("Баланс после траты 10К - " + simple.getBalance());
        simple.pay(3000);
        System.out.println("Баланс после добавления 3К - " + simple.getBalance());
    }
}

