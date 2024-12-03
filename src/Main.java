
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");
        Queue<String> clientQueue = new LinkedList<>(firstClients);

        Comparator.comparing(Person::getExperience, Comparator.reverseOrder())
                .thenComparing(Main::countS, Comparator.reverseOrder())
                .thenComparing(person -> person.getName().length());

        while (clientQueue.iterator().hasNext()) {
            String client = clientQueue.poll();
            System.out.println(client + " сделала новый маникюр");
            if (Math.random() < 0.5) {
                clientQueue.offer("a friend of " + client);
            }
        }
    }

}