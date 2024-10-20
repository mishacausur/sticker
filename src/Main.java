import library.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] products = {"Хлеб", "Яблоки", "Молоко"};
        int[] prices = {100, 200, 300};
        int[] selectedProducts = new int[products.length];



        System.out.println("Список возможных товаров для покупки");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " " + prices[i] + " руб/шт");
        }

        boolean isProgramActive = true;
        while (isProgramActive) {
            System.out.println("Выберите товар и количество или введите `end`");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                isProgramActive = false;
                break;
            }
            String[] inputs = input.split(" ");
            int selectedProduct = Integer.parseInt(inputs[0]) - 1;
            int productCount = Integer.parseInt(inputs[1]);

            selectedProducts[selectedProduct] += productCount;
        }

        System.out.println("Ваша корзина:");

        int count = 0;
        for (int i = 0; i < selectedProducts.length; i++) {
            int selected = selectedProducts[i];
            if (selected != 0) {
                int sum = prices[i] * selected;
                count += sum;
                System.out.println(products[i] + " "  + selected + " шт " + prices[i] + " руб/шт " + sum + " в сумме");
            }
        }

        System.out.println("Итого " + count + " руб");
    }

    public static void buildArrays() {
        int[] arr = new int[3];
        arr[0] = 11;
        arr[1] = 6;
        arr[2] = 91;

        int[] arr2 = { 11, 6, 91 };

        System.out.println(arr == arr2);
        System.out.println(arr.equals(arr2));
        System.out.println(Arrays.equals(arr, arr2));

        for (int num: arr2) {
            System.out.println(num * num);
        }
        int[] arr3 = arr.clone();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr3));
        System.out.println(arr.length);
    }

    public static  void buildBookers() {
        Author stephen = new Author("Stephen", "King", 8);
        Book it = new Book("It", (short) 2024, stephen, 723);
        System.out.println("Is this book big? " + it.isBig());
        System.out.println("Does this book name contains \"It\" " + it.matches("it"));
        System.out.println("Does this book name contains \"king\" " + it.matches("king"));
        System.out.println("How much does this book cost? " + it.estimatePrice() + " rub");
    }
}