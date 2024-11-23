import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    protected static String INPUT = "0. Выход из программы\n" +
            "1. Добавить дело\n" +
            "2. Показать дела\n" +
            "3. Удалить дело по номеру\n" +
            "4. Удалить дело по названию\n" +
            "5. Удалить все дела по ключевому слову\n" +
            "Ваш выбор: ";

    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();

        boolean isWorking = true;
        int command;
        Scanner scanner = new Scanner(System.in);
        while (isWorking) {
            System.out.print(INPUT);
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Ошибка ввода, попробуйте снова");
                continue;
            }

            switch (command) {
                case 0:
                    isWorking = false;
                    break;
                case 1:
                    getTask(scanner, tasks);
                    printList(tasks);
                    break;
                case 2:
                    printList(tasks);
                    break;
                case 3:
                    removeTaskByNumber(scanner, tasks);
                    printList(tasks);
                    break;
                case 4:
                    removeTask(scanner, tasks);
                    printList(tasks);
                    break;
                case 5:
                    removeTasksByKey(scanner, tasks);
                    printList(tasks);
                    break;
            }
        }
    }

    public static void getTask(Scanner scanner, ArrayList<String> list) {
        System.out.print("Введите название задачи: ");
        String task = scanner.nextLine();
        list.add(task);
        System.out.println("Добавлено!");
    }

    public static void printList(ArrayList<String> list) {
        System.out.println();
        if (list.size() > 0) {
            System.out.println("Ваш список дел:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(i + 1 + ". " + list.get(i));
            }
            System.out.println();
        } else {
            System.out.println("Ваш список дел пуст.\n");
        }
    }

    public static void removeTaskByNumber(Scanner scanner, ArrayList<String> list) {
        System.out.print("Введите номер для удаления: ");
        int index = Integer.parseInt(scanner.nextLine());
        if (list.size() >= index) {
            list.remove(index - 1);
            System.out.println("Удалено!");
        } else {
            System.out.println("Ошибка: задачи под номером " + index + " не существует");
        }
    }

    public static void removeTask(Scanner scanner, ArrayList<String> list) {
        System.out.print("Введите задачу для удаления: ");
        String task = scanner.nextLine();
        if (list.contains(task)) {
            list.remove(task);
            System.out.println("Удалено!");
        } else {
            System.out.println("Ошибка: такой задачи не существует");
        }
    }

    public static void removeTasksByKey(Scanner scanner, ArrayList<String> list) {
        System.out.print("Введите ключевое слово: ");
        String key = scanner.nextLine();
        boolean isDeleted = list.removeIf(item -> item.contains(key));

        if (isDeleted) {
            System.out.println("Все задачи по ключевому слову " + key + " удалены");
        } else {
            System.out.println("Ошибка: задач по ключевому слову " + key + " не найдены");
        }
    }
}
