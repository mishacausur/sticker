import java.util.Scanner;
import en.services.CustomService;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цену товара (в руб.): ");
        int cost = scanner.nextInt();
        System.out.print("Введите вес товара (в кг.): ");
        int weight = scanner.nextInt();
        int result = CustomService.calculateCustoms(cost, weight);
        System.out.print("Размер пошлины (в руб.) составит: " + result);
    }
}