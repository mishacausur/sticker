import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer x = scanner.nextInt();
        Integer o = scanner.nextInt();
        Integer result = x + o;
        System.out.println(result);
    }
}