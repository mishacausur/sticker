import java.util.Scanner;
import en.services.CustomService;

public class Main {

    public static void main(String[] args) throws Exception {

        int count = 0;

        while (count < 30) {
            count++;
            if (count % 2 == 0) {
                continue;
            }
            System.out.println("counter is in progress, " + count);
            Thread.sleep(300);
        }
    }
}