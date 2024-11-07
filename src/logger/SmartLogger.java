package logger;

import java.time.LocalDateTime;

public class SmartLogger implements  Logger {
    protected int counter = 1;
    @Override
    public void log(String msg) {
        String title;
        if (msg.toLowerCase().contains("error")) {
            title = "ERROR";
        } else {
            title = "INFO";
        }
        System.out.println(title + "#" + counter + " " + LocalDateTime.now() + " " + msg);
        counter++;
    }
}
