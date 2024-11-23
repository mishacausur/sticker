import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        System.out.println(list);
        list.add(0, "zero");
        System.out.println(list);
        System.out.println(list.size());
        String zero = list.get(0);
        System.out.println(zero);
    }
}
