import library.*;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

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