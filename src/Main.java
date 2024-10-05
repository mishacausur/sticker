import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        while(true) {
            System.out.println("Введите год");
            int enteredYear = scanner.nextInt();
            System.out.println("Введите количество дней:");
            int enteredDays = scanner.nextInt();
            int days = calculateDays(enteredYear);

            if (enteredDays == days) {
                counter++;
            }
            if (enteredDays != days) {
                System.out.println("Неправильно! В этом году " + days + " дней!");
                System.out.println("Набрано очков: " + counter);
                break;
            }
        }
    }

    public static int calculateDays(int year) {
        if (year % 400 == 0) {
            return 366;
        } else if (year % 100 == 0) {
            return 365;
        } else if (year % 4 == 0) {
            return 366;
        } else {
            return 365;
        }
    }
}