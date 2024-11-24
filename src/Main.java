import java.util.*;

public class Main {
    protected static final String INPUT_BEGINING = "Заполнение нового заказа.";
    protected static final String INPUT_COUNTRY = "Введите страну: ";
    protected static final String INPUT_CITY = "Введите город: ";
    protected static final String INPUT_WEIGHT = "Введите вес (кг): ";
    protected static final String TOTAL_DELIVERY_COST = "Общая стоимость всех доставок: %d руб.\n";
    protected static final String DELIVERY_COST = "Стоимость доставки составит: %d руб.\n";
    protected static final String NO_SERVICE_ADDRESS = "Доставки по этому адресу нет";
    protected static final String TOTAL_COUNTRIES_COUNT = "Количество стран для доставки %d\n";
    protected static final String END = "end";

    public static void main(String[] args) {
        Map<Address, Integer> costPerAddress = buildAddressMap();
        Set<String> countries = new HashSet<>();
        boolean isWorking = true;
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        while (isWorking) {
            System.out.println(INPUT_BEGINING);
            System.out.print(INPUT_COUNTRY);
            String country = scanner.nextLine();
            if (country.equalsIgnoreCase(END)) {
                isWorking = false;
            }
            System.out.print(INPUT_CITY);
            String city = scanner.nextLine();
            System.out.print(INPUT_WEIGHT);
            int weight = Integer.parseInt(scanner.nextLine());

            Address inputAddress = new Address(country,city);
            if (costPerAddress.containsKey(inputAddress)) {
                int price = costPerAddress.get(inputAddress) * weight;
                total += price;
                countries.add(inputAddress.country);
                System.out.printf(DELIVERY_COST, price);
                System.out.printf(TOTAL_DELIVERY_COST, total);
            } else {
                System.out.println(NO_SERVICE_ADDRESS);
            }
            System.out.printf(TOTAL_COUNTRIES_COUNT, countries.size());
            System.out.println();
        }
    }

    public static Map<Address, Integer> buildAddressMap() {
        Map<Address, Integer> map = new HashMap<>();
        map.put(new Address("USA", "New York"), 1000);
        map.put(new Address("USA", "San Francisco"), 1100);
        map.put(new Address("USA", "Los Angeles"), 1300);
        map.put(new Address("Japan", "Tokyo"), 500);
        map.put(new Address("Japan", "Kyoto"), 500);
        map.put(new Address("UK", "London"), 800);
        map.put(new Address("UK", "Oxford"), 700);
        map.put(new Address("China", "Beijing"), 400);
        map.put(new Address("China", "Hong Kong"), 700);
        return map;
    }
}
