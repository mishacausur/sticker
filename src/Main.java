import java.util.Scanner;
import en.services.CustomService;

public class Main {

    public static void main(String[] args) throws Exception {


        for (int i = 0; i < 10; i++) {
            System.out.println("counter is in progress, " + i);
            Thread.sleep(300);
        }
    }
}