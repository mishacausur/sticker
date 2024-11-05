import logger.*;

public class Main {

    public static void main(String[] args) {
        SimpleLogger simpleLogger = new SimpleLogger();
        simpleLogger.log("Произошло что-то непонятное");

        SmartLogger smartLogger = new SmartLogger();
        smartLogger.log("без ошибки");
        smartLogger.log("с ошибкой errOR");
    }
}

