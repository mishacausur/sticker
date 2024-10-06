import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String text = """
                Выберите операцию и введите её номер:
                1. Добавить новый доход
                2. Добавить новый расход
                3. Выбрать систему налогообложения""";

        Scanner scanner = new Scanner(System.in);

        int earnings = 0;
        int spendings = 0;

        while (true) {
            System.out.println(text);
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            int operation = Integer.parseInt(input);
            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    String earingMoneyStr = scanner.nextLine();
                    int earingMoney = Integer.parseInt(earingMoneyStr);
                    earnings += earingMoney;
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    String spendingMoneyStr = scanner.nextLine();
                    int spendingMoney = Integer.parseInt(spendingMoneyStr);
                    spendings += spendingMoney;
                    break;
                case 3:
                    int justTax = taxEarnings(earnings);
                    int taxWithSpendings = taxEarningsMinusSpendings(earnings, spendings);
                    System.out.println(compareTaxes(justTax, taxWithSpendings));
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }
        System.out.println("Программа завершена!");
    }

    public static int taxEarnings(int earnings) {
        return earnings * 6 / 100;
    }

    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        return tax >= 0 ? tax : 0;
    }

    public static String compareTaxes(int justTax, int taxWithSpendings) {
        if (justTax < taxWithSpendings) {
            String text = """
                    Мы советуем вам УСН доходы
                    Ваш налог составит: %d рублей
                    Налог на другой системе: %d рублей
                    Экономия: %d рублей
                    """;
            return String.format(text, justTax, taxWithSpendings, (taxWithSpendings - justTax));
        } else {
            String text = """
                    Мы советуем вам УСН доходы минус расходы
                    Ваш налог составит: %d рублей
                    Налог на другой системе: %d рублей
                    Экономия: %d рублей
                    """;
            return String.format(text, taxWithSpendings, justTax, (justTax - taxWithSpendings));
        }
    }
}