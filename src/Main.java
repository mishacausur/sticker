import PasswordChecker.PasswordChecker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean isWorking = true;
        Scanner scanner = new Scanner(System.in);
        PasswordChecker checker = new PasswordChecker();

        System.out.println("Введите мин. длину пароля: ");
        int minLenght = scanner.nextInt();
        try {
            checker.setMinLength(minLenght);
        } catch (Exception e) {
            System.out.println(e);
            System.exit(1);
        }
        System.out.println("Введите макс. допустимое количество повторений символа подряд: ");
        int maxRepeats = scanner.nextInt();
        try {
            checker.setMaxRepeats(maxRepeats);
        } catch (Exception e) {
            System.out.println(e);
            System.exit(1);
        }

        while(isWorking) {
            System.out.println("Введите пароль или end: ");
            String input = scanner.next();
            if (input.equals("end")) {
                isWorking = false;
            }
            try {
                if (checker.verify(input)) {
                    System.out.println("Подходит!");
                } else {
                    System.out.println("Не подходит!");
                }
            } catch (Exception e) {
                System.out.println(e);;
                System.exit(1);
            }
        }
    }
}

