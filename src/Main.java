import java.util.Scanner;
import en.services.CustomService;

public class Main {

    public static void main(String[] args) throws Exception {

        int count = 0;

        while (count < 10) {
            count++;
            System.out.println("counter is in progress");
            Thread.sleep(300);
        }
    }
}