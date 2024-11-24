import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);

        for (Map.Entry<String, Integer> kv : map.entrySet()) {
            System.out.println(kv.getKey() + " is " + kv.getValue());
        }

        for (String key : map.keySet()) {
            System.out.println(key + " means " + map.get(key));
        }
    }
}
