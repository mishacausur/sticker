package en.services;

public class CustomService {
    final static int DUTY_RATE = 100;
    public static int calculateCustoms(int cost, int weight) {
        int result = cost / 100 + weight * DUTY_RATE;
        return result;
    }
}
